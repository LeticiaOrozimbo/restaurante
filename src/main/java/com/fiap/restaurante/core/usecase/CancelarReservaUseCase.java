package com.fiap.restaurante.core.usecase;

import com.fiap.restaurante.core.domain.Reserva;
import com.fiap.restaurante.gateway.ReservaGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CancelarReservaUseCase {
    private ReservaGateway reservaGateway;

    public void cancelarReserva(Long id) {
        // Reserva existe e está ativa
        // Tem que pagar multa por cancelar em cima da hora?
        reservaGateway.excluirReserva(id);
    }
}
