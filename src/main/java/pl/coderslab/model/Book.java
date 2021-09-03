package pl.coderslab.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank
    @Length(min = 10, max = 13)
    private String isbn;

    @NotBlank
    @Length(min = 5, max = 50)
    private String title;

    @NotBlank
    @Length(min = 5, max = 100)
    private String author;

    @NotBlank
    @Length(min = 5, max = 30)
    private String publisher;

    @NotBlank
    @Length(min = 5, max = 20)
    private String type;

}
