package com.adityasharat.java.lesson2.life;

import com.adityasharat.java.lesson2.Property;
import com.sun.istack.internal.NotNull;

/**
 * @author Aditya Sharat
 */
public class Species implements Property {

    @NotNull
    private final Genus genus;

    @NotNull
    private final String name;

    public Species(@NotNull Genus genus, @NotNull String name) {
        this.genus = genus;
        this.name = name;
    }

    @NotNull
    public Genus getGenus() {
        return genus;
    }

    @NotNull
    public String getName() {
        return name;
    }
}
