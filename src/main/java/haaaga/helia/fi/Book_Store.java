package haaaga.helia.fi;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book_Store {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public long id;
    public String title;
	public String author;
	public int year;
	public int isbn;
	public double price;
    protected Book_Store() {}
    
	public Book_Store(String title,String author,int year,int isbn){
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		
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
	
	
	

	
	
	
	

	public long getId() {
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
		return "BookTitle: " + this.title + " Author : " + this.author + " Year: " + this.year + " ISBN: " + this.isbn+ " Price: " + this.price;
		
	}	
	
}
