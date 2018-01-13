package com.adityasharat.java.lesson2.life;

import com.adityasharat.java.lesson2.Entity;
import com.sun.istack.internal.NotNull;

/**
 * @author Aditya Sharat
 */
public class Order implements Entity {

    @NotNull
    private final Class clasz;

    @NotNull
    private final String name;

    public Order(@NotNull Class clasz, @NotNull String name) {
        this.clasz = clasz;
        this.name = name;
    }

    @NotNull
    public Class getClasz() {
        return clasz;
    }

    @NotNull
    public String getName() {
        return name;
    }
}
