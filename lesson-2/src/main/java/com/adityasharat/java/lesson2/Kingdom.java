package com.adityasharat.java.lesson2;

import com.sun.istack.internal.NotNull;

/**
 * @author Aditya Sharat
 */
public class Kingdom {

    @NotNull
    public final Domain domain;

    @NotNull
    public final String name;

    public Kingdom(Domain domain, String name) {
        this.domain = domain;
        this.name = name;
    }
}
