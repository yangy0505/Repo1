package com.yangying.por.exception;

public class UserNotInSessionException extends Exception {

    public UserNotInSessionException() {
        super();
    }

    public UserNotInSessionException(String message) {
        super(message);
    }

    public UserNotInSessionException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotInSessionException(Throwable cause) {
        super(cause);
    }

    protected UserNotInSessionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
