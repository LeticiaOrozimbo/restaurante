package com.fiap.restaurante.core.usecase;

import com.fiap.restaurante.core.usecase.dto.ClienteDTO;
import com.fiap.restaurante.core.usecase.factories.ClienteFactory;
import com.fiap.restaurante.gateway.ClienteGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastrarClienteUseCase {
    private final ClienteGateway clienteGateway;

    public ClienteDTO cadastrarCliente(ClienteDTO clienteDTO) {
        var cliente = ClienteFactory.buildModelFromDTO(clienteDTO);

        var id = clienteGateway.salvar(cliente);

        return new ClienteDTO(
                id,
                clienteDTO.getNome(),
                clienteDTO.getTelefone()
        );
    }
}
