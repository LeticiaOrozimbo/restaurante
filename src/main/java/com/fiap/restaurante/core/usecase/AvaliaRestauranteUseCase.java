package com.fiap.restaurante.core.usecase;

import com.fiap.restaurante.core.usecase.dto.AvaliacaoDTO;
import com.fiap.restaurante.core.usecase.factories.AvaliacaoFactory;
import com.fiap.restaurante.gateway.AvaliacaoGateway;
import com.fiap.restaurante.gateway.ClienteGateway;
import com.fiap.restaurante.gateway.RestauranteGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvaliaRestauranteUseCase {

    @Autowired
    private AvaliacaoGateway avaliacaoGateway;

    @Autowired
    private RestauranteGateway restauranteGateway;

    @Autowired
    private ClienteGateway clienteGateway;

    public AvaliacaoDTO avaliarRestaurante(AvaliacaoDTO avaliacaoDTO) {
        var id = avaliacaoGateway.avaliarRestaurante(AvaliacaoFactory.buildModelFromDTO(avaliacaoDTO));

        return new AvaliacaoDTO(
                id,
                avaliacaoDTO.getRestauranteId(),
                avaliacaoDTO.getClienteId(),
                avaliacaoDTO.getNota(),
                avaliacaoDTO.getComentario(),
                avaliacaoDTO.getData()
        );
    }
}