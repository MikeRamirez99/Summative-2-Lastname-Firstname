package com.company.bookstore.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "book")
public class Book implements Serializable {
    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id;

    @NotNull
    private String isbn;

    @NotNull
    private LocalDate publish_date;

    @OneToMany(mappedBy = "author_id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Author> author_id;

    @NotNull
    private String title;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Publisher> publisher_id;


    @NotNull
    private BigDecimal price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(LocalDate publish_date) {
        this.publish_date = publish_date;
    }

    public Set<Author> getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Set<Author> author_id) {
        this.author_id = author_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Publisher> getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(Set<Publisher> publisher_id) {
        this.publisher_id = publisher_id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && Objects.equals(isbn, book.isbn) && Objects.equals(publish_date, book.publish_date) && Objects.equals(author_id, book.author_id) && Objects.equals(title, book.title) && Objects.equals(publisher_id, book.publisher_id) && Objects.equals(price, book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isbn, publish_date, author_id, title, publisher_id, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", publish_date=" + publish_date +
                ", author_id=" + author_id +
                ", title='" + title + '\'' +
                ", publisher_id=" + publisher_id +
                ", price=" + price +
                '}';
    }
}
