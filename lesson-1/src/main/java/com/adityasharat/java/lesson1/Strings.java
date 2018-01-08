package com.adityasharat.java.lesson1;

import java.util.Objects;

/**
 * @author Aditya Sharat
 */
public class Strings {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        if (x == y) {
            System.out.println("x == y");
        } else {
            System.out.println("x != y");
        }


        String hello1 = "Hello !!";
        String hello2 = "Hello !!";

        if (hello1 == hello2) { // == does not compare non primitive types (expect Wrappers)
            System.out.println("hello1 == hello2");
        } else {
            System.out.println("hello1 != hello2");
        }

        if (Objects.equals(hello1, hello2)) {
            System.out.println("hello1 equals hello2");
        } else {
            System.out.println("hello1 not equals hello2");
        }

    }

}
