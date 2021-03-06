package com.oracle.dragon.util.exception;

public class DatabaseUserCreationFailedException extends DSException {
    public DatabaseUserCreationFailedException(Throwable t) {
        super(ErrorCode.DatabaseUserCreationFailed,  "The DRAGON user couldn't be created!",t);
    }
}
