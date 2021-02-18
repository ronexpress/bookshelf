package com.codecool.bookshelf;

import com.codecool.bookshelf.model.books.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookSelf {

    List<Book> books = new ArrayList<Book>();

    public BookSelf() {}
    public BookSelf(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks(final int year) {
        return books.stream().filter(book -> book.getReleaseYear() == year).collect(Collectors.toList());
    }

    public String getLightestAuthor() {
        return books.stream().min(Comparator.comparing(Book::getWeightInGram)).get().getBookInfo();
    }
}
