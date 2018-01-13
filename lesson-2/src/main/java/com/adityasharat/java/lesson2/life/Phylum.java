package com.adityasharat.java.lesson2.life;

import com.adityasharat.java.lesson2.Property;
import com.sun.istack.internal.NotNull;

/**
 * @author Aditya Sharat
 */
public class Phylum implements Property {

    @NotNull
    private final Kingdom kingdom;

    @NotNull
    private final String name;

    public Phylum(@NotNull Kingdom kingdom, @NotNull String name) {
        this.kingdom = kingdom;
        this.name = name;
    }

    @NotNull
    public Kingdom getKingdom() {
        return kingdom;
    }

    @NotNull
    public String getName() {
        return name;
    }
}
