package com.utils.exeptiion;

public class JavaLoopsCustomException extends Exception {
    public JavaLoopsCustomException(final String message) {
        super(message);
    }

    //@param message is the exception message
    //@param cause is the cause of the original exception

    public JavaLoopsCustomException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
}
