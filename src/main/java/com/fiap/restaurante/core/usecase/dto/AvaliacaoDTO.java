package com.fiap.restaurante.core.usecase.dto;

import java.time.LocalDateTime;

public record Avaliacao(
         Long id,
         Long restauranteId,
         Long clienteId,
         float nota,
         String comentario,
         LocalDateTime data) {
}
