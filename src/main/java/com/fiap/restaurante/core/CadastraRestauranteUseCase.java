package com.fiap.restaurante.core;

import com.fiap.restaurante.core.domain.Restaurante;
import com.fiap.restaurante.core.usecase.factories.Factory;
import com.fiap.restaurante.gateway.RestauranteGateway;
import com.fiap.restaurante.gateway.database.repository.RestauranteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastraRestauranteUseCase {

    private final RestauranteGateway restauranteGateway;

    public Restaurante cadastraRestaurante(Restaurante restaurante) {
        var id = restauranteGateway.criar(restaurante);
        restaurante.atribuirId(id);
        return restaurante;
    }
}
