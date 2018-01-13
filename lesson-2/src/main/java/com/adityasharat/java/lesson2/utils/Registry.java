package com.adityasharat.java.lesson2.utils;

import com.adityasharat.java.lesson2.utils.exception.EntityAlreadyExistsException;

/**
 * @author Aditya Sharat
 */
public interface Registry<E extends Entity> {

    void register(E entity) throws EntityAlreadyExistsException;
}
