package com.fiap.restaurante.controller;

import com.fiap.restaurante.core.usecase.AvaliaRestauranteUseCase;
import com.fiap.restaurante.core.usecase.dto.AvaliacaoDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoController {

    @Autowired
    private AvaliaRestauranteUseCase avaliaRestauranteUseCase;

    @PostMapping
    public ResponseEntity<AvaliacaoDTO> avaliarRestaurante(@Valid @RequestBody AvaliacaoDTO avaliacaoDTO) {
        avaliacaoDTO = avaliaRestauranteUseCase.avaliarRestaurante(avaliacaoDTO);
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(avaliacaoDTO);
    }
}
