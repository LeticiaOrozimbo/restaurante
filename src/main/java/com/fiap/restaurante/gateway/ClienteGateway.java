package com.fiap.restaurante.gateway;

import com.fiap.restaurante.core.domain.Cliente;
import com.fiap.restaurante.gateway.database.entity.ClienteEntity;

public interface ClienteGateway {
    ClienteEntity buscar(Long id);
    Long salvar(Cliente cliente);
}
