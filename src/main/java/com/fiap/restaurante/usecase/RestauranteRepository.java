package com.fiap.restaurante.usecase;

import com.fiap.restaurante.domain.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
}
