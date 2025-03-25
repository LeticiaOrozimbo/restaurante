package com.fiap.restaurante.usecase;

import com.fiap.restaurante.usecase.dtos.RestauranteDTO;
import com.fiap.restaurante.usecase.factory.Factory;
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
