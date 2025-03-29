package com.fiap.restaurante.gateway.database;

import com.fiap.restaurante.core.domain.Avaliacao;
import com.fiap.restaurante.exceptions.ErroAoAcessarRepositorioException;
import com.fiap.restaurante.gateway.AvaliacaoGateway;
import com.fiap.restaurante.gateway.database.entity.AvaliacaoEntity;
import com.fiap.restaurante.gateway.database.entity.RestauranteEntity;
import com.fiap.restaurante.gateway.database.repository.AvaliacaoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class AvaliacaoJpaGateway implements AvaliacaoGateway {
    private final AvaliacaoRepository avaliacaoRepository;

    @Override
    public Long avaliarRestaurante(Avaliacao avaliacao) {
        try {
            AvaliacaoEntity avaliacaoEntity = mapToEntity(avaliacao);
            return avaliacaoRepository.save(avaliacaoEntity).getId();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new ErroAoAcessarRepositorioException(e.getMessage());
        }
    }

    private AvaliacaoEntity mapToEntity(Avaliacao avaliacao) {
        return new AvaliacaoEntity(
                avaliacao.getId(),
                avaliacao.getRestauranteId(),
                avaliacao.getClienteId(),
                avaliacao.getNota(),
                avaliacao.getComentario(),
                avaliacao.getData()
        );
    }
}
