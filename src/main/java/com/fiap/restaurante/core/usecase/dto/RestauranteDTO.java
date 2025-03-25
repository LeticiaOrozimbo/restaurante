package com.fiap.restaurante.core.usecase.dto;

public record RestauranteDTO(
        Long id,
        String nome,
        String localizacao,
        String tipoDeCozinha,
        String horarioDeFuncionamento,
        int capacidade
) {
}
