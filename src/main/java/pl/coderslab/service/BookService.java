package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.Book;
import pl.coderslab.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public interface BookService {

    List<Book> findAll();

    void save(Book book);

    Book findById(Long id);

    void delete(Book book);

}
