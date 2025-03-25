package com.fiap.restaurante.core.usecase.dto;

import java.time.LocalDateTime;

public record Reserva( Long id,
         Long restauranteId,
         Long clienteId,
         LocalDateTime dataHora,
         String status,
         int numeroDePessoas) {
}
