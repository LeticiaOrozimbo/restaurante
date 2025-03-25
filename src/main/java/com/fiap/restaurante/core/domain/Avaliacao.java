package com.fiap.restaurante.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Avaliacao {
    private Long id;
    private Long restauranteId;
    private Long clienteId;
    private float nota;
    private String comentario;
    private LocalDateTime data;
}
