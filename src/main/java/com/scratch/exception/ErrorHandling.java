package com.scratch.exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorHandling extends RuntimeException {
    public ErrorHandling(String message) {
        super(message);
    }

    public ErrorHandling(String message, Throwable cause) {
        super(message, cause);
    }
}
