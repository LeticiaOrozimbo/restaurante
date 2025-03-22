package com.fiap.restaurante.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Avaliacao {

    private Long id;
    private Long restauranteId;
    private Long clienteId;
    private float nota;
    private String comentario;
    private LocalDateTime data;

    public Avaliacao(Long id, Long restauranteId, Long clienteId, float nota, String comentario, LocalDateTime data) {
        this.id = id;
        this.restauranteId = restauranteId;
        this.clienteId = clienteId;
        this.nota = nota;
        this.comentario = comentario;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRestauranteId() {
        return restauranteId;
    }

    public void setRestauranteId(Long restauranteId) {
        this.restauranteId = restauranteId;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
