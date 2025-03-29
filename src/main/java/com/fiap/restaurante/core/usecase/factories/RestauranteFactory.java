package com.fiap.restaurante.core.usecase.factories;

import com.fiap.restaurante.core.domain.Restaurante;
import com.fiap.restaurante.core.usecase.dto.RestauranteDTO;
import com.fiap.restaurante.gateway.database.entity.RestauranteEntity;

public class RestauranteFactory {
    public static Restaurante buildModelFromDTO(RestauranteDTO restauranteDTO) {
        return new Restaurante(
                restauranteDTO.getId(),
                restauranteDTO.getNome(),
                restauranteDTO.getLocalizacao(),
                restauranteDTO.getTipoDeCozinha(),
                restauranteDTO.getHorarioDeAbertura(),
                restauranteDTO.getHorarioDeFechamento(),
                restauranteDTO.getCapacidade()
        );
    }

    public static RestauranteDTO buildDTOFromModel(Restaurante restaurante) {
        return new RestauranteDTO(
                restaurante.getId(),
                restaurante.getNome(),
                restaurante.getLocalizacao(),
                restaurante.getTipoDeCozinha(),
                restaurante.getHorarioDeAbertura(),
                restaurante.getHorarioDeFechamento(),
                restaurante.getCapacidade()
        );
    }

    public static Restaurante buildModelFromEntity(RestauranteEntity restauranteEntity) {
        return new Restaurante(
                restauranteEntity.getId(),
                restauranteEntity.getNome(),
                restauranteEntity.getLocalizacao(),
                restauranteEntity.getTipoDeCozinha(),
                restauranteEntity.getHorarioDeAbertura(),
                restauranteEntity.getHorarioDeFechamento(),
                restauranteEntity.getCapacidade()
        );
    }
}
