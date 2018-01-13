package com.adityasharat.java.lesson2.life;

import com.adityasharat.java.lesson2.Property;
import com.sun.istack.internal.NotNull;

/**
 * @author Aditya Sharat
 */
public class Class implements Property {

    @NotNull
    private final Phylum phylum;

    @NotNull
    private final String name;

    public Class(@NotNull Phylum phylum, @NotNull String name) {
        this.phylum = phylum;
        this.name = name;
    }

    @NotNull
    public Phylum getPhylum() {
        return phylum;
    }

    @NotNull
    public String getName() {
        return name;
    }
}
