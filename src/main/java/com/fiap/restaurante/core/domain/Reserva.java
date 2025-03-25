package com.fiap.restaurante.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Reserva {
    private Long id;
    private Long restauranteId;
    private Long clienteId;
    private LocalDateTime dataHora;
    private String status;
    private int numeroDePessoas;
}
