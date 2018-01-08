package com.adityasharat.java.lesson1;

import java.util.Objects;

/**
 * @author Aditya Sharat
 */
public class Strings {

    public static void main(String[] args) {
        String hello1 = "Hello !!";
        String hello2 = "Hello !!";

        if (hello1 == hello2) {
            System.out.println("== : They are equal");
        } else {
            System.out.println("== : They are not equal");
        }

        if (Objects.equals(hello1, hello2)) {
            System.out.println(".equals : They are equal");
        } else {
            System.out.println(".equals : They are not equal");
        }

    }

}
