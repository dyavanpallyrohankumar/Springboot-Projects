package com.foodadda.exception;

public class InvalidCredintials extends RuntimeException {
    public InvalidCredintials(String msg) {
        super(msg);
    }
}
