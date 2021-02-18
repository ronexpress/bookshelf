package com.codecool.bookshelf.model.books;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BookTest {

    Book book;


    @Test
    public void getReleaseYear() {
        assertEquals(1970, book.getReleaseYear());
    }

    @Test
    public void getBookInfo() {
        assertEquals("Tolkien: Gyűr (1970)", book.getBookInfo());
    }
}
