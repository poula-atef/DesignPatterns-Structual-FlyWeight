package com.mycode.designpatternsstructuralflyweight.entities;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    // we assume that type can't be duplicated
    private final Map<String, BookType> factory = new HashMap<>();

    public BookType getBookType(String type, String department) {
        if (!factory.containsKey(type)) {
            System.out.println("New Book Type Is Created With Type :: " + type + ", Department :: " + department);
            factory.put(type, new BookType(type, department));
        }
        return factory.get(type);
    }
}
