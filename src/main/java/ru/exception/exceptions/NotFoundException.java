package ru.exception.exceptions;

public class NotFoundException extends RuntimeException {

    public NotFoundException(int id) {
        super("Element with id: " + id + " not found");
    }
}
