package com.fiap.restaurante.core.usecase.dto;

import java.time.LocalDateTime;

public record AvaliacaoDTO(
         Long id,
         Long restauranteId,
         Long clienteId,
         float nota,
         String comentario,
         LocalDateTime data) {
}
