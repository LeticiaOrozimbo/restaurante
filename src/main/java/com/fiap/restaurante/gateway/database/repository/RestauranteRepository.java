package com.fiap.restaurante.gateway.database.repository;

import com.fiap.restaurante.gateway.database.entity.RestauranteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RestauranteRepository extends JpaRepository<RestauranteEntity, Long> {
}
