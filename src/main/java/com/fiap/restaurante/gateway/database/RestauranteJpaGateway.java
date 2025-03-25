package com.fiap.restaurante.gateway.database;

import com.fiap.restaurante.core.domain.Restaurante;
import com.fiap.restaurante.exceptions.ErroAoAcessarRepositorioException;
import com.fiap.restaurante.gateway.RestauranteGateway;
import com.fiap.restaurante.gateway.database.entity.RestauranteEntity;
import com.fiap.restaurante.gateway.database.repository.RestauranteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class RestauranteJpaGateway implements RestauranteGateway {

    private final RestauranteRepository restauranteRepository;

    @Override
    public Long criar(Restaurante restaurante) {
        try {
            RestauranteEntity restauranteEntity = mapToEntity(restaurante);
            return restauranteRepository.save(restauranteEntity).getId();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new ErroAoAcessarRepositorioException(e.getMessage());
        }
    }

    private RestauranteEntity mapToEntity(Restaurante restaurante) {
        return RestauranteEntity.builder().build();
    }
}
