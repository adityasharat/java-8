package com.adityasharat.java.lesson2;

import com.sun.istack.internal.NotNull;

/**
 * @author Aditya Sharat
 */
public class Phylum {

    @NotNull
    public final Kingdom kingdom;

    @NotNull
    public final String name;

    public Phylum(Kingdom kingdom, String name) {
        this.kingdom = kingdom;
        this.name = name;
    }
}
