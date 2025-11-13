package edu.realemj.exercises.exceptions;

public class InvalidRadiusException extends Exception {
    public InvalidRadiusException() {
        super();
    }

    public InvalidRadiusException(String message) {
        super(message);
    }

    public InvalidRadiusException(String message, Exception e) {
        super(message, e);
    }
}
