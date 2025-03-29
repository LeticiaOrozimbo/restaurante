package com.fiap.restaurante.core.usecase;

import com.fiap.restaurante.core.domain.Restaurante;
import com.fiap.restaurante.core.usecase.dto.RestauranteDTO;
import com.fiap.restaurante.gateway.RestauranteGateway;
import com.fiap.restaurante.gateway.database.repository.RestauranteRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.ArgumentMatchers.any;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

import java.time.LocalTime;

public class CadastrarRestauranteTest {

    @Mock
    private RestauranteGateway restauranteGateway;

    private CadastraRestauranteUseCase cadastraRestauranteUseCase;

    AutoCloseable mock;

    @BeforeEach
    void setup() {
        mock = MockitoAnnotations.openMocks(this);
        cadastraRestauranteUseCase = new CadastraRestauranteUseCase(restauranteGateway);
    }

    @AfterEach
    void tearDown() throws Exception {
        mock.close();
    }
    @Test
    void devePermitirCadastraRestaurante() {
        // Arrange
        var restauranteDTO = new RestauranteDTO(
                null,
               "Restaurante Bom Prato",
                "Rua A, 50",
                "Italiano",
                LocalTime.now(),
                 LocalTime.now(),
                 50
        );

        when(restauranteGateway.criar(any(Restaurante.class)))
                .thenAnswer(i -> 1L);

        // Act
        var restauranteCadastrado = cadastraRestauranteUseCase.cadastraRestaurante(restauranteDTO);

        // Assert
        assertThat(restauranteCadastrado).isInstanceOf(RestauranteDTO.class).isNotNull();
        assertThat(restauranteCadastrado.getNome()).isEqualTo(restauranteDTO.getNome());
        assertThat(restauranteCadastrado.getId()).isNotNull();
        verify(restauranteGateway, times(1)).criar(any(Restaurante.class));
    }
}
