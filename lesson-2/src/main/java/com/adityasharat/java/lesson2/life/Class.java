package com.adityasharat.java.lesson2.life;

import com.sun.istack.internal.NotNull;

/**
 * @author Aditya Sharat
 */
public class Class {

    @NotNull
    public final Phylum phylum;

    @NotNull
    public final String name;

    public Class(Phylum phylum, String name) {
        this.phylum = phylum;
        this.name = name;
    }
}
