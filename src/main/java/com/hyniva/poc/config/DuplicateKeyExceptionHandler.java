package com.hyniva.poc.config;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class DuplicateKeyExceptionHandler {
    @ExceptionHandler(DuplicateKeyException.class)
    public ResponseEntity<Object> handleDuplicateKeyException(DuplicateKeyException ex){

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Duplicate entry found - Customer already exists: "+ex.getMessage());
    }
}
