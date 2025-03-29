package com.fiap.restaurante.gateway.database;

import com.fiap.restaurante.core.domain.Cliente;
import com.fiap.restaurante.exceptions.ErroAoAcessarRepositorioException;
import com.fiap.restaurante.gateway.ClienteGateway;
import com.fiap.restaurante.gateway.database.entity.ClienteEntity;
import com.fiap.restaurante.gateway.database.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ClienteJpaGateway implements ClienteGateway {

    private final ClienteRepository clienteRepository;

    @Override
    public ClienteEntity buscar(Long id) {
        return clienteRepository.findById(id).orElseThrow();
    }

    @Override
    public Long salvar(Cliente cliente) {
        try {
            ClienteEntity clienteEntity = mapToEntity(cliente);
            return clienteRepository.save(clienteEntity).getId();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new ErroAoAcessarRepositorioException(e.getMessage());
        }
    }

    private ClienteEntity mapToEntity(Cliente cliente) {
        return new ClienteEntity(
            cliente.getId(),
            cliente.getNome(),
            cliente.getTelefone()
        );
    }
}
