package com.adityasharat.java.lesson2.life;

import com.adityasharat.java.lesson2.Entity;
import com.sun.istack.internal.NotNull;

/**
 * @author Aditya Sharat
 */
public class Kingdom implements Entity {

    @NotNull
    private final Domain domain;

    @NotNull
    private final String name;

    public Kingdom(@NotNull Domain domain, @NotNull String name) {
        this.domain = domain;
        this.name = name;
    }

    @NotNull
    public Domain getDomain() {
        return domain;
    }

    @NotNull
    public String getName() {
        return name;
    }
}
