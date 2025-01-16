package com.example.demo.global.exception;

import lombok.Getter;

@Getter
public class InvalidAgeException extends RuntimeException {

    private final ErrorCode errorCode;

    public InvalidAgeException(int age, ErrorCode errorCode) {
        super(String.format("%s => {%d}", errorCode.getMessage(), age));
        this.errorCode = errorCode;
    }
}
