package com.fiap.restaurante.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Reserva {
    private Long id;
    private Restaurante restaurante;
    private Cliente cliente;
    private LocalDateTime horarioReserva;
    private String status; // TODO: Transformar num enum
    private int numeroDePessoas;

    public void atribuirId(Long id) {
        this.id = id;
    }
}
