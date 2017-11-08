package com.adityasharat.java;

import org.junit.jupiter.api.Test;

/**
 * @author Aditya Sharat
 */
class ConvertTest {

    @Test
    public void run() {
        String result = Functions.convert("A", 16, 10);
        System.out.println(result);
    }
}