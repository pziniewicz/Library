package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.Book;

import java.util.List;

@Service
public interface BookService {

    List<Book> findAll();

    void save(Book book);

    Book findById(Long id);

    void delete(Book book);

}
