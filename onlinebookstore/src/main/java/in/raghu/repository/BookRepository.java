package in.raghu.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import in.raghu.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
	
}
