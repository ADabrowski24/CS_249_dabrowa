package edu.realemj.exercises.exceptions;

public class OBJFileException extends Exception {
    public OBJFileException() {
        super();
    }

    public OBJFileException(String message) {
        super(message);
    }

    public OBJFileException(String message, Exception cause) {
        super(message, cause);
    }
}
