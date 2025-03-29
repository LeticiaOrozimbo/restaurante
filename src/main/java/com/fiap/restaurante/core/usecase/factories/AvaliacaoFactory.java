package com.fiap.restaurante.core.usecase.factories;

import com.fiap.restaurante.core.domain.Avaliacao;
import com.fiap.restaurante.core.domain.Reserva;
import com.fiap.restaurante.core.usecase.dto.AvaliacaoDTO;
import com.fiap.restaurante.core.usecase.dto.ReservaDTO;

import java.time.LocalDateTime;

public class AvaliacaoFactory {
    public static Avaliacao buildModelFromDTO(AvaliacaoDTO avaliacaoDTO) {
        return new Avaliacao(
                avaliacaoDTO.getId(),
                avaliacaoDTO.getRestauranteId(),
                avaliacaoDTO.getClienteId(),
                avaliacaoDTO.getNota(),
                avaliacaoDTO.getComentario(),
                avaliacaoDTO.getData()
        );
    }

    public static AvaliacaoDTO buildDTOFromModel(Avaliacao avaliacao) {
        return new AvaliacaoDTO(
                avaliacao.getId(),
                avaliacao.getRestauranteId(),
                avaliacao.getClienteId(),
                avaliacao.getNota(),
                avaliacao.getComentario(),
                avaliacao.getData()
        );
    }
}
