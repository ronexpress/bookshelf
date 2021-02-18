package com.codecool.bookshelf.model.books;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter
public class Author {

    private final long id;
    private final String name;
    private final Date birthDate;
    private List<Book> bibliography = new ArrayList<>();


    public Author(String name, Date birthDate, long id) {
        this.name = name;
        this.birthDate = birthDate;
        this.id = id;
    }

    public void addBookToBibliography(Book book) {
        bibliography.add(book);
    }
}

