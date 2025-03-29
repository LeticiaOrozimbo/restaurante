package com.fiap.restaurante.core.usecase;

import com.fiap.restaurante.core.usecase.dto.ReservaDTO;
import com.fiap.restaurante.core.usecase.exceptions.ReservaDuplicadaException;
import com.fiap.restaurante.core.usecase.exceptions.RestauranteFechadoException;
import com.fiap.restaurante.core.usecase.factories.ClienteFactory;
import com.fiap.restaurante.core.usecase.factories.ReservaFactory;
import com.fiap.restaurante.core.usecase.factories.RestauranteFactory;
import com.fiap.restaurante.gateway.ClienteGateway;
import com.fiap.restaurante.gateway.ReservaGateway;
import com.fiap.restaurante.gateway.RestauranteGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservarMesaUseCase {
    private final ReservaGateway reservaGateway;
    private final RestauranteGateway restauranteGateway;
    private final ClienteGateway clienteGateway;

    public ReservaDTO reservarMesa(ReservaDTO reservaDTO) {
        // Garantir que o restaurante informado é válido
        var restauranteEntity = restauranteGateway.buscar(reservaDTO.getRestauranteId());
        var restaurante = RestauranteFactory.buildModelFromEntity(restauranteEntity);

        // Garantir que o restaurante estará aberto no dia/horário solicitado
        if (!restaurante.estaAbertoNoHorarioSolicitado(reservaDTO.getHorarioReserva())) {
            throw new RestauranteFechadoException("Restaurante fechado no horario " + reservaDTO.getHorarioReserva());
        }

        // Garantir que o cliente existe
        var clienteEntity = clienteGateway.buscar(reservaDTO.getClienteId());
        var cliente = ClienteFactory.buildModelFromEntity(clienteEntity);

        var reserva = ReservaFactory.buildModelFromDTO(reservaDTO, restaurante, cliente);

        var id = reservaGateway.criarReserva(reserva);
        reserva.atribuirId(id);

        reservaDTO = ReservaFactory.buildDTOFromModel(reserva);
        return reservaDTO;
    }
}
