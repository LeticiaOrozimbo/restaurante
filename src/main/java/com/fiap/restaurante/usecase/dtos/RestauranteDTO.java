package com.fiap.restaurante.usecase.dtos;

public record RestauranteDTO(
        Long id,
        String nome,
        String localizacao,
        String tipoDeCozinha,
        String horarioDeFuncionamento,
        int capacidade
) {
}