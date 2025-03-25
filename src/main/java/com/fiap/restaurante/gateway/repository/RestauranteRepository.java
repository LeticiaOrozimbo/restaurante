package com.fiap.restaurante.gateway.repository;

import com.fiap.restaurante.core.domain.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
}
