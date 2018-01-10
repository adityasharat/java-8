package com.adityasharat.java.lesson1;

import java.util.Objects;
import java.util.StringJoiner;

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
        String hello2 = hello();

        if (hello1 == hello2) { // == does not compare non primitive types (except primitive wrappers)
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

    private static String hello() {
        StringJoiner joiner = new StringJoiner("");
        joiner.add("H").add("e").add("l").add("l").add("o").add(" !!");
        return joiner.toString();
    }
}
