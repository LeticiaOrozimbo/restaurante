package com.fiap.restaurante.controller;

import com.fiap.restaurante.usecase.CadastraRestaurante;
import com.fiap.restaurante.usecase.dtos.RestauranteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestauranteController {

    @Autowired
    private CadastraRestaurante cadastraRestaurante;

    @PostMapping("/cadastrar")
    public RestauranteDTO cadastrarRestaurante(
            @RequestBody String nome,
            @RequestBody String localizacao,
            @RequestBody String tipoDeCozinha,
            @RequestBody String horarioDeFuncionamento,
            @RequestBody int capacidade) {
        var dto = new RestauranteDTO(
                null,
                nome,
                localizacao,
                tipoDeCozinha,
                horarioDeFuncionamento,
                capacidade
        );

        return cadastraRestaurante.cadastraRestaurante(dto);
    }
}
