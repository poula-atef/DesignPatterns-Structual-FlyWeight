package com.mycode.designpatternsstructuralflyweight.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {

    private String name;
    private Integer numberOfPages;
    private BookType bookType;
}
