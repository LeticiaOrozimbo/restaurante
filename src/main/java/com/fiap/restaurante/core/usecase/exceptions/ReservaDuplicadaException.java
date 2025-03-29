package com.fiap.restaurante.core.usecase.exceptions;

public class ReservaDuplicadaException extends RuntimeException {
  public ReservaDuplicadaException(String message) {
    super(message);
  }
}
