package com.adityasharat.java.lesson5.trees;

/**
 * @author Aditya Sharat
 */
public class Node<V> {

    public final V value;

    public Node<V> right;

    public Node<V> left;

    public Node(V value) {
        this.value = value;
    }
}
