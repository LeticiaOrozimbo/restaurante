package com.fiap.restaurante.gateway.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="restaurante")
public class RestauranteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String localizacao;
    private String tipoDeCozinha;
    private String horarioDeAbertura;
    private String horarioDeFechamento;
    private int capacidade;
}
