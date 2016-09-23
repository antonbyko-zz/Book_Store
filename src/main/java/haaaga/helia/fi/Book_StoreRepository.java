package haaaga.helia.fi;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface Book_StoreRepository extends CrudRepository<Book_Store, Long> {

    List<Book_Store> findByTitle(String title);
    
}
