package com.fiap.restaurante.exceptions;

public class ErroAoAcessarRepositorioException extends RuntimeException {
    public ErroAoAcessarRepositorioException(String message) {
        super(message);
    }
}
