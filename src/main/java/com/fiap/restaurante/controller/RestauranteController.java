package com.fiap.restaurante.controller;


import com.fiap.restaurante.core.usecase.dto.RestauranteDTO;
import com.fiap.restaurante.core.usecase.CadastraRestauranteUseCase;
import com.fiap.restaurante.core.domain.Restaurante;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    @Autowired
    private CadastraRestauranteUseCase cadastraRestauranteUseCase;

    @PostMapping
    public ResponseEntity<RestauranteDTO> cadastrarRestaurante(@Valid @RequestBody RestauranteDTO restauranteDTO) {
        restauranteDTO = cadastraRestauranteUseCase.cadastraRestaurante(restauranteDTO);
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(restauranteDTO);
    }
}
