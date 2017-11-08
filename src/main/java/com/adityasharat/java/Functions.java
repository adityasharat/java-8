package com.adityasharat.java;

import com.adityasharat.java.trees.Node;
import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aditya Sharat
 */
public class Functions {

    public static String[][] powersets(String set[]) {

        int n = set.length;
        int size = (1 << n); // number of power sets = 2^n, 1 << n is a shift operation
        String[][] sets = new String[size][];

        // run a loop for all 2^n
        for (int i = 0; i < size; i++) {

            // current subset
            List<String> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {

                // (1 << j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0) {
                    subset.add(set[j]);
                }
            }

            sets[i] = subset.toArray(new String[subset.size()]);
        }

        // return the sets
        return sets;
    }

    public static String convert(String number, int from, int to) {
        return Integer.toString(Integer.valueOf(number, from), to);
    }

    public static List<String> inOrder(Node node) {
        return inOrder(node, new ArrayList<>());
    }

    private static List<String> inOrder(Node node, List<String> result) {

        if (node.left != null) {
            inOrder(node.left, result);
        }

        result.add(node.value != null ? node.value.toString() : "NULL");

        if (node.right != null) {
            inOrder(node.right, result);
        }

        return result;
    }
}
