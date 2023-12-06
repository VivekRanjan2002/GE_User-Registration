package org.example;

class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}