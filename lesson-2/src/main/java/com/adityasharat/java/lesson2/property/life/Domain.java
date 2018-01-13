package com.adityasharat.java.lesson2.property.life;

import com.adityasharat.java.lesson2.utils.Property;
import com.sun.istack.internal.NotNull;

/**
 * @author Aditya Sharat
 */
public class Domain implements Property {

    @NotNull
    private final String name;

    public Domain(@NotNull String name) {
        this.name = name;
    }

    @NotNull
    public String getName() {
        return name;
    }
}
