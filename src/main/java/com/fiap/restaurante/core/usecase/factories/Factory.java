package com.fiap.restaurante.core.usecase.factories;

import com.fiap.restaurante.core.domain.Restaurante;
import com.fiap.restaurante.gateway.database.entity.RestauranteEntity;

public class Factory {
    public static Restaurante buildFrom(RestauranteEntity restauranteEntity) {
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

    public static RestauranteEntity buildFrom(Restaurante restaurante) {
        return new RestauranteEntity(
                restaurante.getId(),
                restaurante.getNome(),
                restaurante.getLocalizacao(),
                restaurante.getTipoDeCozinha(),
                restaurante.getHorarioDeAbertura(),
                restaurante.getHorarioDeFechamento(),
                restaurante.getCapacidade()
        );
    }
}
