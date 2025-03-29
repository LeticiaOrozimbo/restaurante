package com.fiap.restaurante.core.usecase.factories;

import com.fiap.restaurante.core.domain.Cliente;
import com.fiap.restaurante.core.domain.Reserva;
import com.fiap.restaurante.core.usecase.dto.ClienteDTO;
import com.fiap.restaurante.core.usecase.dto.ReservaDTO;
import com.fiap.restaurante.gateway.database.entity.ClienteEntity;

import java.time.LocalDateTime;

public class ClienteFactory {
    public static Cliente buildModelFromDTO(ClienteDTO clienteDTO) {
        return new Cliente(
            clienteDTO.getId(),
            clienteDTO.getNome(),
            clienteDTO.getTelefone()
        );
    }

    public static ClienteDTO buildDTOFromModel(Cliente cliente) {
        return new ClienteDTO(
                cliente.getId(),
                cliente.getNome(),
                cliente.getTelefone()
        );
    }

    public static Cliente buildModelFromEntity(ClienteEntity clienteEntity) {
        return new Cliente(
                clienteEntity.getId(),
                clienteEntity.getNome(),
                clienteEntity.getTelefone()
        );
    }
}
