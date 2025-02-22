package com.example.demo.global.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleInvalidAgeException(InvalidAgeException ex) {
        log.error("InvalidAgeException = {}", ex.getMessage(), ex);
        return ErrorResponse.toResponseEntity(ex.getErrorCode());
    }

    @ExceptionHandler
    public ModelAndView handleGeneralException(Exception ex) {
        log.error("Exception = {}", ex.getMessage(), ex);
        ModelAndView mav = new ModelAndView("error/error");
        return mav;
    }
}
