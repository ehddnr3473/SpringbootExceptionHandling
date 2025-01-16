package com.example.demo.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    INVALID_AGE(HttpStatus.BAD_REQUEST, "유효하지 않은 나이가 입력되었습니다."),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "사용자 권한이 없습니다."),
    UNDEFINED(HttpStatus.INTERNAL_SERVER_ERROR, "알 수 없는 에러가 발생했습니다.");

    private final HttpStatus httpStatus;
    private final String message;
}
