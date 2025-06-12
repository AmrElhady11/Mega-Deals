package com.MegaDeals.exception;

import com.MegaDeals.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerException {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundException e) {
          ErrorResponse error = ErrorResponse.builder().
                  message(e.getMessage())
                  .code(HttpStatus.NOT_FOUND.value())
                  .timestamp(System.currentTimeMillis())
                  .build();
          return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(ExpirationException.class)
    public ResponseEntity<ErrorResponse> handleExpirationException(ExpirationException e) {
        ErrorResponse error = ErrorResponse.builder().
                message(e.getMessage())
                .code(HttpStatus.UNAUTHORIZED.value())
                .timestamp(System.currentTimeMillis())
                .build();
        return new ResponseEntity<>(error, HttpStatus.UNAUTHORIZED);

    }


    @ExceptionHandler(InvalidException.class)
    public ResponseEntity<ErrorResponse> handleInvalidException(InvalidException e) {
        ErrorResponse error = ErrorResponse.builder().
                message(e.getMessage())
                .code(HttpStatus.UNAUTHORIZED.value())
                .timestamp(System.currentTimeMillis())
                .build();
        return new ResponseEntity<>(error, HttpStatus.UNAUTHORIZED);

    }
}
