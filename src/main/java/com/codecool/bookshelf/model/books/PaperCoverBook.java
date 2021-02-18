package com.codecool.bookshelf.model.books;

public class PaperCoverBook extends Book {
    private static final int GRAM_PER_PAGE = 10;
    private static final int GRAM_PER_COVER = 100;
    public PaperCoverBook(long id, String title, String author, int releaseYear, int numberOfPages) {
        super(id, title, author, releaseYear, numberOfPages, GRAM_PER_PAGE*numberOfPages+GRAM_PER_COVER);
    }
}
