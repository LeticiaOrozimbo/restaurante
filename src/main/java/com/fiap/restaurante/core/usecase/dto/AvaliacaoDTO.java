package com.fiap.restaurante.core.usecase.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class AvaliacaoDTO {
    private Long id;
    private Long restauranteId;
    private Long clienteId;
    private int nota;
    private String comentario;
    private LocalDateTime data;
}
