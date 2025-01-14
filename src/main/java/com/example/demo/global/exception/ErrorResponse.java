package com.example.demo.global.exception;

import java.time.LocalDateTime;

public record ErrorResponse(LocalDateTime timeStamp, String message) {}
