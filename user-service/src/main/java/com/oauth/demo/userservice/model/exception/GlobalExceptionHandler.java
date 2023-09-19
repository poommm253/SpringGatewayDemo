package com.oauth.demo.userservice.model.exception;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleUserNotFound(ResourceNotFoundException ex) {
        Map<String, Object> errorResponse = new HashMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss z");
        String timestamp = sdf.format(new Date());

        errorResponse.put("status", HttpStatus.SC_NOT_FOUND);
        errorResponse.put("timestamp", timestamp);
        errorResponse.put("error", ex.getMessage());

        return new ResponseEntity<Map<String, Object>>(errorResponse, null, HttpStatus.SC_NOT_FOUND);
    }
}
