package com.fiap.restaurante.core.usecase.factories;

import com.fiap.restaurante.core.usecase.dto.RestauranteDTO;
import com.fiap.restaurante.core.domain.Restaurante;

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
