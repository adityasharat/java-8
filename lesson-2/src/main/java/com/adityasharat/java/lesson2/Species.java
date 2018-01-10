package com.adityasharat.java.lesson2;

import com.sun.istack.internal.NotNull;

/**
 * @author Aditya Sharat
 */
public class Species {

    @NotNull
    public final Genus genus;

    @NotNull
    public final String name;

    public Species(Genus genus, String name) {
        this.genus = genus;
        this.name = name;
    }
}
