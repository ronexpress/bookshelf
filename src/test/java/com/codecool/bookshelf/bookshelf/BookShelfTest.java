package com.codecool.bookshelf.bookshelf;

import com.codecool.bookshelf.BookSelf;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BookShelfTest {

    @Test
    public void booksList() {
        BookSelf bookSelf = new BookSelf();
        NoSuchElementException thrown = assertThrows(
                NoSuchElementException.class,
                bookSelf::getLightestAuthor,
                "No Such element"
        );

        assertTrue(thrown.getMessage().contains("No"));
    }
}
