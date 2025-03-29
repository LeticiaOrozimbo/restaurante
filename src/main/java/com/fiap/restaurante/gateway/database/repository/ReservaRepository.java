package com.fiap.restaurante.gateway.database.repository;

import com.fiap.restaurante.gateway.database.entity.ReservaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<ReservaEntity, Long> {

}
