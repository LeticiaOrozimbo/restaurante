package com.fiap.restaurante.gateway.database.entity;

import com.fiap.restaurante.core.domain.Restaurante;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="avaliacao")
public class AvaliacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long restauranteId;
    private Long clienteId;
    private float nota;
    private String comentario;
    private LocalDateTime data;
}