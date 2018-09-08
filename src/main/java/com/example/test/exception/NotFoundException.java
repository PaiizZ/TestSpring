package com.example.test.exception;

import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException{
    private String errorCode;
    private String errorDescription;

    public NotFoundException(String errorCode, String errorDescription) {
        super();
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }
}
