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
	public CommandLineRunner studentDemo(Book_StoreRepository repository,CategoryRepository c_repository,UserRepository urepository) {
		return (args) -> {
			log.info("save a couple of books");
			
			c_repository.save(new Category("IT"));
			c_repository.save(new Category("Animals"));
			c_repository.save(new Category("Laws"));
			
			repository.save(new Book_Store("Java Introduction", " Dr. Liang ",2005,12345,c_repository.findByName("IT").get(0)));
			repository.save(new Book_Store("Python Introduction", " Mr. Python ",2008,54321,c_repository.findByName("IT").get(0)));
			// Create users: admin/admin user/user
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			urepository.save(user1);
			urepository.save(user2);
			
		};
	}
}
		

