package com.fiap.restaurante.controller;


import com.fiap.restaurante.controller.json.RestauranteJson;
import com.fiap.restaurante.core.CadastraRestauranteUseCase;
import com.fiap.restaurante.core.domain.Restaurante;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Restaurante cadastrarRestaurante(@Valid @RequestBody RestauranteJson restauranteJson) {

        return cadastraRestauranteUseCase.cadastraRestaurante(mapToDomain(restauranteJson));
    }

    private Restaurante mapToDomain(RestauranteJson restauranteJson) {
        return new Restaurante(
                restauranteJson.getId(),
                restauranteJson.getNome(),
                restauranteJson.getLocalizacao(),
                restauranteJson.getTipoDeCozinha(),
                restauranteJson.getHorarioDeAbertura(),
                restauranteJson.getHorarioDeFechamento(),
                restauranteJson.getCapacidade()
        );
    }
}
