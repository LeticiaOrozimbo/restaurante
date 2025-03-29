package com.fiap.restaurante.core.usecase.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class ClienteDTO {
    private Long id;
    private String nome;
    private String telefone;
}
