package com.fiap.restaurante.controller.json;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class RestauranteJson {
    private Long id;

    @NotBlank
    private String nome;
    @NotBlank
    private String localizacao;
    @NotBlank
    private String tipoDeCozinha;
    @NotBlank
    private String horarioDeAbertura;
    @NotBlank
    private String horarioDeFechamento;
    @NotBlank
    private int capacidade;
}
