package com.fiap.restaurante.gateway;

import com.fiap.restaurante.core.domain.Avaliacao;

public interface AvaliacaoGateway {
    Long avaliarRestaurante(Avaliacao avaliacao);
}