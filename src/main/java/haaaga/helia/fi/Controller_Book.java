package haaaga.helia.fi;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class Controller_Book {
	@RequestMapping(value="/hello", method=RequestMethod.GET)
    public String greetingForm (Model model) {

	
	
		
		return "Template_BookStore";
	}
}
