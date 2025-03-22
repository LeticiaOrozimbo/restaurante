package com.fiap.restaurante.usecase.factory;

import com.fiap.restaurante.domain.Restaurante;
import com.fiap.restaurante.usecase.dtos.RestauranteDTO;

public class Factory {
    public static RestauranteDTO buildFrom(Restaurante restaurante) {
        return new RestauranteDTO(
                restaurante.getId(),
                restaurante.getNome(),
                restaurante.getLocalizacao(),
                restaurante.getTipoDeCozinha(),
                restaurante.getHorarioDeFuncionamento(),
                restaurante.getCapacidade()
        );
    }

    public static Restaurante buildFrom(RestauranteDTO dto) {
        return new Restaurante(
                dto.id(),
                dto.nome(),
                dto.localizacao(),
                dto.tipoDeCozinha(),
                dto.horarioDeFuncionamento(),
                dto.capacidade()
        );
    }
}
