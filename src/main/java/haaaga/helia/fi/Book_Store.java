package haaaga.helia.fi;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Book_Store {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;
    public String title;
	public String author;
	public int year;
	public int isbn;
	public double price;
	
	@ManyToOne
    @JoinColumn(name = "categoryid")
    private Category category;
    public Book_Store() {}
    
	public Book_Store(String title,String author,int year,int isbn, Category category){
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.category = category;
		
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}
	public int getYear(){
		return this.year;
	}
	
	public void setCategory(Category category){
		this.category = category;
	}
	
	public Category getCategory(){
		return this.category;
	}

	
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	

	

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString(){
		if (this.category != null){
		return "BookTitle: " + this.title + " Author : " + this.author + " Year: " + this.year + " ISBN: " + this.isbn+ " Category: " + this.category;
		}
		else{
			return "BookTitle: " + this.title + " Author : " + this.author + " Year: " + this.year + " ISBN: " + this.isbn;
			
		}
	}	
	
}
