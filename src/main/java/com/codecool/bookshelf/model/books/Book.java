package com.codecool.bookshelf.model.books;

public class Book {
    private final long id;
    private String title;
    private String author;
    private int releaseYear;
    private int numberOfPages;
    private int weightInGram;

    public Book(long id, String title, String author, int releaseYear, int numberOfPages, int weightInGram) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.numberOfPages = numberOfPages;
        this.weightInGram = weightInGram;
    }

    public String getBookInfo(){
        return author+": "+title+" ("+releaseYear+")";
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getWeightInGram() {
        return weightInGram;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
