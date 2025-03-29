package com.fiap.restaurante.core.usecase;

import com.fiap.restaurante.core.domain.Restaurante;
import com.fiap.restaurante.core.usecase.dto.RestauranteDTO;
import com.fiap.restaurante.core.usecase.factories.RestauranteFactory;
import com.fiap.restaurante.gateway.RestauranteGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastraRestauranteUseCase {

    private final RestauranteGateway restauranteGateway;

    public RestauranteDTO cadastraRestaurante(RestauranteDTO restauranteDTO) {
        var restaurante = RestauranteFactory.buildModelFromDTO(restauranteDTO);
        var id = restauranteGateway.criar(restaurante);
        restaurante.atribuirId(id);
        return RestauranteFactory.buildDTOFromModel(restaurante);
    }
}
