package com.fiap.restaurante.domain;

import java.time.LocalDateTime;

public class Cliente {

    private  Long id;
    private String nome;
    private LocalDateTime dataDaReserva;
    private String telefone;


    public Cliente(Long id, String nome, LocalDateTime dataDaReserva, String telefone) {
        this.id = id;
        this.nome = nome;
        this.dataDaReserva = dataDaReserva;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataDaReserva() {
        return dataDaReserva;
    }

    public void setDataDaReserva(LocalDateTime dataDaReserva) {
        this.dataDaReserva = dataDaReserva;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
