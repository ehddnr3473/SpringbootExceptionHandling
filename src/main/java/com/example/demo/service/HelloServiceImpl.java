package com.example.demo.service;

import com.example.demo.global.exception.ErrorCode;
import com.example.demo.global.exception.InvalidAgeException;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public void validate(int age) {
        if (age < 19 || age > 150) {
            throw new InvalidAgeException(age, ErrorCode.INVALID_AGE);
        }
    }
}
