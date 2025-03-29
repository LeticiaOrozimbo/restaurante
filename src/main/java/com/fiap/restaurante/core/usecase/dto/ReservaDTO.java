package com.fiap.restaurante.core.usecase.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class ReservaDTO {
    private Long id;
    private Long restauranteId;
    private Long clienteId;
    private LocalDateTime horarioReserva;
    private String status;
    private int numeroDePessoas;
}
