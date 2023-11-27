package com.mycode.designpatternsstructuralflyweight.entities;

import java.util.HashMap;
import java.util.Map;

public class Store {
    // we assume that book name can't be duplicated
    private final Map<String, Book> books = new HashMap<>();
    private final BookFactory factory = new BookFactory();

    public void storeBook(String name, Integer numberOfPages, String type, String department) {
        if (!books.containsKey(name))
            books.put(name, new Book(name, numberOfPages, factory.getBookType(type, department)));
    }

    public void showAllStoreBooks() {
        for (Map.Entry<String, Book> bookEntry : books.entrySet()) {
            System.out.println("Book With Name :: " + bookEntry.getKey() + " Has :: " + bookEntry.getValue().getNumberOfPages());
        }
    }
}
