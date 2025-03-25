package com.fiap.restaurante.core.usecase.dto;

import java.time.LocalDateTime;

public record ClienteDTO(
        Long id,
        String nome,
        LocalDateTime dataDaReserva,
        String telefone
) {
}
