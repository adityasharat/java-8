package com.adityasharat.java.lesson2.utils.exception;

/**
 * @author Aditya Sharat
 */
public class EntityAlreadyExistsException extends IllegalArgumentException {

    public EntityAlreadyExistsException(String type, String id) {
        super(String.format("%s with id %s already exists.", type, id));
    }
}
