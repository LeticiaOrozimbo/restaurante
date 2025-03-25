package com.fiap.restaurante.core;

import com.fiap.restaurante.core.usecase.factories.Factory;
import com.fiap.restaurante.core.usecase.dto.RestauranteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastraRestaurante {

    @Autowired
    RestauranteRepository restauranteRepository;

    public RestauranteDTO cadastraRestaurante(RestauranteDTO dto) {
        var restaurante = Factory.buildFrom(dto);
        restauranteRepository.save(restaurante);
        return Factory.buildFrom(restaurante);
    }
}
