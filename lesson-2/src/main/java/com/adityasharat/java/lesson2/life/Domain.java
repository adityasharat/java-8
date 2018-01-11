package com.adityasharat.java.lesson2.life;

import com.adityasharat.java.lesson2.Entity;
import com.sun.istack.internal.NotNull;

/**
 * @author Aditya Sharat
 */
public class Domain implements Entity {

    @NotNull
    private final String name;

    public Domain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
