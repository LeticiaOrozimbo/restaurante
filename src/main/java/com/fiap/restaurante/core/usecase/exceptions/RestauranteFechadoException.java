package com.fiap.restaurante.core.usecase.exceptions;

public class RestauranteFechadoException extends RuntimeException {
    public RestauranteFechadoException(String message) {
        super(message);
    }
}
