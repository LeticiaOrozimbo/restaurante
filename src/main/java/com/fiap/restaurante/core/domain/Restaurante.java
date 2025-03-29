package com.fiap.restaurante.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;

@AllArgsConstructor
@Getter
public class Restaurante {
    private Long id;
    private String nome;
    private String localizacao;
    private String tipoDeCozinha;
    private LocalTime horarioDeAbertura;
    private LocalTime horarioDeFechamento;
    private int capacidade;

    public void atribuirId(Long id) {
        this.id = id;
    }

    public boolean estaAbertoNoHorarioSolicitado(LocalDateTime horarioReserva) {
        return horarioReserva.toLocalTime().isAfter(horarioDeAbertura) &&
                horarioReserva.toLocalTime().isBefore(horarioDeFechamento);
    }
}
