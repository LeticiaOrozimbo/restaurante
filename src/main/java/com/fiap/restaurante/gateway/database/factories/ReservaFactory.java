package com.fiap.restaurante.gateway.database.factories;

import com.fiap.restaurante.core.domain.Reserva;
import com.fiap.restaurante.core.domain.Restaurante;
import com.fiap.restaurante.gateway.database.entity.ReservaEntity;

public class ReservaFactory {
    public static ReservaEntity buildEntityFromModel(Reserva reserva) {
        return new ReservaEntity(
                reserva.getId(),
                reserva.getRestaurante().getId(),
                reserva.getCliente().getId(),
                reserva.getHorarioReserva(),
                reserva.getStatus(),
                reserva.getNumeroDePessoas()
        );
    }

//    public static Reserva buildModelFromEntity(ReservaEntity reservaEntity, Restaurante restaurante) {
//        return new Reserva(
//                reservaEntity.getId(),
//                restaurante,
//                reservaEntity.getClienteId(),
//                reservaEntity.getHorarioReserva(),
//                reservaEntity.getStatus(),
//                reservaEntity.getNumeroDePessoas()
//        );
//    }
}
