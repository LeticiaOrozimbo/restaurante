package com.fiap.restaurante.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Cliente {
    private Long id;
    private String nome;
    private LocalDateTime dataDaReserva;
    private String telefone;
}
