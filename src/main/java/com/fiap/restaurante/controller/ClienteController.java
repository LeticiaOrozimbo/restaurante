package com.fiap.restaurante.controller;

import com.fiap.restaurante.core.usecase.CadastrarClienteUseCase;
import com.fiap.restaurante.core.usecase.dto.ClienteDTO;
import com.fiap.restaurante.core.usecase.dto.ReservaDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private CadastrarClienteUseCase cadastrarClienteUseCase;

    @PostMapping
    public ResponseEntity<ClienteDTO> reservarMesa(@Valid @RequestBody ClienteDTO clienteDTO) {
        clienteDTO = cadastrarClienteUseCase.cadastrarCliente(clienteDTO);
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(clienteDTO);
    }
}
