package com.fiap.restaurante.core.usecase.factories;

import com.fiap.restaurante.core.domain.Cliente;
import com.fiap.restaurante.core.domain.Restaurante;
import com.fiap.restaurante.core.usecase.dto.ReservaDTO;
import com.fiap.restaurante.core.domain.Reserva;

public class ReservaFactory {
    public static Reserva buildModelFromDTO(ReservaDTO reservaDTO, Restaurante restaurante, Cliente cliente) {
        return new Reserva(
                reservaDTO.getId(),
                restaurante,
                cliente,
                reservaDTO.getHorarioReserva(),
                reservaDTO.getStatus(),
                reservaDTO.getNumeroDePessoas()
        );
    }

    public static ReservaDTO buildDTOFromModel(Reserva reserva) {
        return new ReservaDTO(
                reserva.getId(),
                reserva.getRestaurante().getId(),
                reserva.getCliente().getId(),
                reserva.getHorarioReserva(),
                reserva.getStatus(),
                reserva.getNumeroDePessoas()
        );
    }
}
