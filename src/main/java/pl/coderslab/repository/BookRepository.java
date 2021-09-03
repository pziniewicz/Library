package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {


}
