package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Book;
import pl.coderslab.service.JpaBookService;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("/book")
public class BookController {
    private final JpaBookService jpaBookService;

    @Autowired
    public BookController(JpaBookService jpaBookService) {
        this.jpaBookService = jpaBookService;
    }

    @GetMapping("/create")
    public String create(Long id, Model model) {
        Book book;
        if (id != null) {
            book = jpaBookService.findById(id);
        } else {
            book = new Book();
        }
        model.addAttribute(book);
        return "createBook";
    }

    @PostMapping("/create")
    public String create(@Valid Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "createBook";
        }
        jpaBookService.save(book);
        return "redirect:/book/";
    }

    @RequestMapping("/")
    public String getAll(Model model) {
        List<Book> books = jpaBookService.findAll();
        model.addAttribute("books", books);
        return "listBooks";
    }

    @RequestMapping(value = "/{id}", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String show(@PathVariable Long id) {
        return "Ksiazka o id: " + id + " to: " + jpaBookService.findById(id);
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        Book book = jpaBookService.findById(id);
        jpaBookService.delete(book);
        return "redirect:/book/";
    }
}
