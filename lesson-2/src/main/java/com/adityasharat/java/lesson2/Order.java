package com.adityasharat.java.lesson2;

import com.sun.istack.internal.NotNull;

/**
 * @author Aditya Sharat
 */
public class Order {

    @NotNull
    public final Class clasz;

    @NotNull
    public final String name;

    public Order(Class clasz, String name) {
        this.clasz = clasz;
        this.name = name;
    }
}
