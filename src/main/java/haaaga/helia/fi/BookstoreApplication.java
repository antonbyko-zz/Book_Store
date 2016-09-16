package haaaga.helia.fi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner studentDemo(BookstoreRepository repository) {
		return (args) -> {
			log.info("save a couple of books");
			repository.save(new Book_Store("Java Introduction", " Dr. Liang ",2005,12345));
			repository.save(new Book_Store("Python Introduction", " Mr. Python ",2008,54321));
			
		};
	}
}
		

