package com.fiap.restaurante.domain;

public class Restaurante {

    private Long id;
    private String nome;
    private String localizacao;
    private String tipoDeCozinha;
    private String horarioDeFuncionamento;
    private int capacidade;

    public Restaurante(Long id, String nome, String localizacao, String tipoDeCozinha, String horarioDeFuncionamento, int capacidade) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
        this.tipoDeCozinha = tipoDeCozinha;
        this.horarioDeFuncionamento = horarioDeFuncionamento;
        this.capacidade = capacidade;
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

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getTipoDeCozinha() {
        return tipoDeCozinha;
    }

    public void setTipoDeCozinha(String tipoDeCozinha) {
        this.tipoDeCozinha = tipoDeCozinha;
    }

    public String getHorarioDeFuncionamento() {
        return horarioDeFuncionamento;
    }

    public void setHorarioDeFuncionamento(String horarioDeFuncionamento) {
        this.horarioDeFuncionamento = horarioDeFuncionamento;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
