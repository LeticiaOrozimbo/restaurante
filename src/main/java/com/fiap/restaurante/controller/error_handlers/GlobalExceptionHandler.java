package com.fiap.restaurante.controller.error_handlers;

import com.fiap.restaurante.core.usecase.exceptions.RestauranteFechadoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RestauranteFechadoException.class)
    public ResponseEntity<String> handlePagamentoPendenteException(RestauranteFechadoException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
