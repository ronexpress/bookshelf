package com.codecool.bookshelf.model.feedback;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Rating {

    private final long id;
    private long bookId;
    private long userId;

    @Setter
    @Getter
    private int rating;

}
