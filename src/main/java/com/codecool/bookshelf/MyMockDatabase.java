package com.codecool.bookshelf;

import com.codecool.bookshelf.model.books.Book;
import com.codecool.bookshelf.model.user.Customer;
import lombok.Data;

import java.util.List;

@Data
public class MyMockDatabase {

    private List<Customer> customerList;
    private List<Book> BookListOnShelf;

}
