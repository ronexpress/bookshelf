package com.codecool.bookshelf.model.user;

import com.codecool.bookshelf.model.books.Book;
import com.codecool.bookshelf.model.feedback.Opinion;
import com.codecool.bookshelf.model.feedback.Rating;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Customer {

    private final long id;
    private String name;
    private String username;
    private Date birthDate;
    private String email;
    private List<Book> wish;
    private List<Rating> ratings;
    private List<Opinion> opinions = new ArrayList<>();

    public Customer(String name, String username, Date birthDate, String email, long id) {
        this.name = name;
        this.username = username;
        this.birthDate = birthDate;
        this.email = email;
        this.id = id;
    }

    public void addBook(Book book) {
        wish.add(book);
    }

    public void addRating(Rating rating) {
        ratings.add(rating);
    }

    public void addOpinion(Opinion opinion) {
        opinions.add(opinion);
    }
}
