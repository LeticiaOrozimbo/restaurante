package com.fiap.restaurante.domain;

import java.time.LocalDateTime;

public class Reserva {

    private Long id;
    private Long restauranteId;
    private Long clienteId;
    private LocalDateTime dataHora;
    private String status;
    private int numeroDePessoas;

    public Reserva(Long id, Long restauranteId, Long clienteId, LocalDateTime dataHora, String status, int numeroDePessoas) {
        this.id = id;
        this.restauranteId = restauranteId;
        this.clienteId = clienteId;
        this.dataHora = dataHora;
        this.status = status;
        this.numeroDePessoas = numeroDePessoas;
    }

    public Long getId() {
        return id;
    }

    public Long getCliente() {
        return clienteId;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getTipoServico() {
        return status;
    }

    public int getRestauranteId() {
        return numeroDePessoas;
    }
}
