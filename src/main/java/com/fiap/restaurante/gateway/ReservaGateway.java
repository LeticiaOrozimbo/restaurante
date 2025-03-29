package com.fiap.restaurante.gateway;

import com.fiap.restaurante.core.domain.Reserva;
import com.fiap.restaurante.gateway.database.entity.ReservaEntity;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface ReservaGateway {
    Long criarReserva(Reserva reserva);
    void excluirReserva(Long id);
    ReservaEntity buscarReserva(Long id);
}
