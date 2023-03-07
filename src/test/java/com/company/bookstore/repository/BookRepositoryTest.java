package com.company.bookstore.repository;

import com.company.bookstore.model.Author;
import com.company.bookstore.model.Book;
import com.company.bookstore.model.Publisher;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookRepositoryTest {

    //Set up autowired
    @Autowired
    BookRepository bookRepo;

    @Before
    public void setUp() throws Exception {
        bookRepo.deleteAll();
    }

    // Create Book
    @Test
    public void shouldCreateBook()
    {
        //ARRANGE
        Book book = new Book();
        book.setIsbn("9783161484100");
        book.setPublish_date(LocalDate.ofEpochDay(2018-02-24));
        book.setAuthor_id(new HashSet<Author>());
        book.setTitle("Dictionary");
        book.setPublisher_id(new HashSet<Publisher>());
        book.setPrice(BigDecimal.valueOf(19.99));

        //ACT
        bookRepo.save(book);

        //ASSERT
        Optional<Book> bookTest = bookRepo.findById(book.getId());
        assertEquals(bookTest.get(),book);
    }
}