package com.mycode.designpatternsstructuralflyweight;

import com.mycode.designpatternsstructuralflyweight.entities.Store;

public class DesignPatternsStructuralFlyWeightApplication {
    public static void main(String[] args) {

        Store store = new Store();

        store.storeBook("Harry Potter and the Philosopher's Stone", 250, "Fantasy", "Adventure Department");
        store.storeBook("gang of four design patterns", 440, "Computer Science", "Science Department");
        store.storeBook("Harry Potter and the Chamber Of Secrets", 290, "Fantasy", "Adventure Department");
        store.storeBook("Introduction to Algorithms", 300, "Computer Science", "Science Department");

        store.showAllStoreBooks();
    }

}
