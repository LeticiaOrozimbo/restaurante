package com.fiap.restaurante.gateway.database.repository;

import com.fiap.restaurante.gateway.database.entity.AvaliacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvaliacaoRepository extends JpaRepository<AvaliacaoEntity, Long> { }
