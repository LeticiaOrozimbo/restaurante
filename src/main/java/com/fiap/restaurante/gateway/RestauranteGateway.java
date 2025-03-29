package com.fiap.restaurante.gateway;

import com.fiap.restaurante.core.domain.Restaurante;
import com.fiap.restaurante.gateway.database.entity.RestauranteEntity;

public interface RestauranteGateway {
    Long criar(Restaurante restaurante);
    RestauranteEntity buscar(Long id);
}
