package com.example.demo.controller;

import com.example.demo.global.exception.ErrorCode;
import com.example.demo.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping("/hello")
    public String hello(@RequestParam int age) {
        helloService.validate(age);
        return "hello";
    }

    @GetMapping("/undefined")
    public void undefined() {
        throw new IllegalStateException(ErrorCode.UNDEFINED.getMessage());
    }
}
