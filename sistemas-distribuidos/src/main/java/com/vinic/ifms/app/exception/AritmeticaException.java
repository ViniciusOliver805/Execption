package com.vinic.ifms.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AritmeticaException extends RuntimeException {

    public AritmeticaException(String message) {
        super(message);
    }
}
