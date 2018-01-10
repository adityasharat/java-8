package com.adityasharat.java.lesson2;

import com.sun.istack.internal.NotNull;

/**
 * @author Aditya Sharat
 */
public class Genus {

    @NotNull
    public final Family family;

    @NotNull
    public final String name;

    public Genus(Family family, String name) {
        this.family = family;
        this.name = name;
    }
}
