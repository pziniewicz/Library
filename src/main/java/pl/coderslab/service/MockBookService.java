package pl.coderslab.service;

import org.springframework.stereotype.Component;
import pl.coderslab.model.Book;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockBookService implements BookService {
    private static List<Book> list;
    private static Long nextId = 5L;

    public MockBookService() {
        list = new ArrayList<>();
//        list.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
//        list.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
//                "programming"));
//        list.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
//                "programming"));
//        list.add(new Book(4L, "9780596007126", "Head First Design Patterns", "Eric Freeman", "O'Reilly",
//                "programming"));
    }

    public Book findById(Long id) {
        return list.stream()
                .filter(b -> b.getId()
                        .equals(id))
                .findAny()
                .get();
    }

    public void save(Book book) {
        book.setId(nextId);
        list.add(book);
        nextId++;
    }

    public List<Book> findAll() {
        return list;
    }

    public void delete(Book book) {
        if (this.findById(book.getId()) != null) {
            list.remove(this.findById(book.getId()));
        }
    }
}
