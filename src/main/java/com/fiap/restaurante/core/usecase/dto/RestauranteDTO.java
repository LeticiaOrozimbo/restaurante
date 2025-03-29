package com.fiap.restaurante.core.usecase.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;

@AllArgsConstructor
@Getter
public class RestauranteDTO {
    private Long id;
    private String nome;
    private String localizacao;
    private String tipoDeCozinha;
    private LocalTime horarioDeAbertura;
    private LocalTime horarioDeFechamento;
    private int capacidade;
}
