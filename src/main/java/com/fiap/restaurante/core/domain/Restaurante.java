package com.fiap.restaurante.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Restaurante {
    private Long id;
    private String nome;
    private String localizacao;
    private String tipoDeCozinha;
    private String horarioDeAbertura;
    private String horarioDeFechamento;
    private int capacidade;

    public void atribuirId(Long id) {
        this.id = id;
    }
}
