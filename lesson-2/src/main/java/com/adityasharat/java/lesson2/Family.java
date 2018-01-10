package com.adityasharat.java.lesson2;

import com.sun.istack.internal.NotNull;

/**
 * @author Aditya Sharat
 */
public class Family {

    @NotNull
    public final Order order;

    @NotNull
    public final String name;

    public Family(Order order, String name) {
        this.order = order;
        this.name = name;
    }
}
