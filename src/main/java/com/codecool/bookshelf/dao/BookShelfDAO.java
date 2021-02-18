package com.codecool.bookshelf.dao;

import com.codecool.bookshelf.model.books.Author;
import com.codecool.bookshelf.model.books.Book;

import java.util.List;

public interface BookShelfDAO {

    public void addBookToDB(Book book);
    public Book findByTitle(String title);
    public List<Book> findBooksByAuthor(Author author);
    public Book findById(Book book);
}
