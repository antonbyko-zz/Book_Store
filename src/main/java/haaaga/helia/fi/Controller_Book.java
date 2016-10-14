package haaaga.helia.fi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;





@Controller
public class Controller_Book {
	@Autowired
	private Book_StoreRepository repository;
	@Autowired
	private CategoryRepository c_repository;
	
	 @RequestMapping(value="/login")
	    public String login() {	
	        return "login";
	    }	
	
	// Show all Students
	@RequestMapping(value = "/book_list")
	public String BookList(Model model) {
		model.addAttribute("books", repository.findAll());
		return "book_list";
	}
	
	// RESTful service to get all books
    @RequestMapping(value="/books", method = RequestMethod.GET)
    public @ResponseBody List<Book_Store> studentListRest() {	
        return (List<Book_Store>) repository.findAll();
    }    
    @RequestMapping(value="/book/{id}", method = RequestMethod.GET)
    public @ResponseBody Book_Store findBookRest(@PathVariable("id") Long id) {	
    	return repository.findOne(id);
    }      

	// Add new book
    @PreAuthorize("hasAuthority('ADMIN')")
	@RequestMapping(value = "/add")
	public String addBook(Model model) {
		model.addAttribute("book", new Book_Store());
		model.addAttribute("categories", c_repository.findAll());
		return "addbook";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Book_Store book) {
		repository.save(book);
		return "redirect:book_list";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteBook(@PathVariable("id") Long id, Model model) {
		repository.delete(id);
		return "redirect:../book_list";
	}
	
    
     


}


