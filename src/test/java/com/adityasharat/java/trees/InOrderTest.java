package com.adityasharat.java.trees;

import com.adityasharat.java.Functions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.StringJoiner;

/**
 * @author Aditya Sharat
 */
class InOrderTest {

    @Test
    public void run() {

        Node<String> _1 =  new Node<>("1");
        Node<String> _2 = new Node<>("2");
        Node<String> _3 =  new Node<>("3");
        Node<String> _4 = new Node<>("4");
        Node<String> _5 = new Node<>("5");

        _1.left = _2;
        _1.right = _3;

        _2.left = _4;
        _2.right = _5;

        Node<String> root = _1;

        List<String> result = Functions.inOrder(root);
        StringJoiner joiner = new StringJoiner("");
        result.forEach(joiner::add);
        System.out.println(result);
    }

}