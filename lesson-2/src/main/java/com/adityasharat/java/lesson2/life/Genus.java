package com.adityasharat.java.lesson2.life;

import com.adityasharat.java.lesson2.Entity;
import com.sun.istack.internal.NotNull;

/**
 * @author Aditya Sharat
 */
public class Genus implements Entity {

    @NotNull
    private final Family family;

    @NotNull
    private final String name;

    public Genus(@NotNull Family family, @NotNull String name) {
        this.family = family;
        this.name = name;
    }

    @NotNull
    public Family getFamily() {
        return family;
    }

    @NotNull
    public String getName() {
        return name;
    }
}
