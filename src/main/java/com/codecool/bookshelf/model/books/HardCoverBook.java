package com.codecool.bookshelf.model.books;

public class HardCoverBook extends Book {
    private static final int GRAM_PER_PAGE = 10;
    private static final int GRAM_PER_COVER = 100;
    public HardCoverBook(long id, String title, String author, int releaseYear, int numberOfPages, int weightInGram) {
        super(id, title, author, releaseYear, numberOfPages, weightInGram);
    }
}
