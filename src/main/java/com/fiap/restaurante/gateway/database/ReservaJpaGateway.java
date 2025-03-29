package com.fiap.restaurante.gateway.database;

import com.fiap.restaurante.core.domain.Reserva;
import com.fiap.restaurante.exceptions.ErroAoAcessarRepositorioException;
import com.fiap.restaurante.gateway.ReservaGateway;
import com.fiap.restaurante.gateway.database.entity.ReservaEntity;
import com.fiap.restaurante.gateway.database.factories.ReservaFactory;
import com.fiap.restaurante.gateway.database.repository.ReservaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

@Slf4j
@Component
@RequiredArgsConstructor
public class ReservaJpaGateway implements ReservaGateway {

    private final ReservaRepository reservaRepository;

    @Override
    public Long criarReserva(Reserva reserva) {
        try {
            ReservaEntity reservaEntity = ReservaFactory.buildEntityFromModel(reserva);
            return reservaRepository.save(reservaEntity).getId();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new ErroAoAcessarRepositorioException(e.getMessage());
        }
    }

    @Override
    public void excluirReserva(Long id) {
        try {
            reservaRepository.deleteById(id);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new ErroAoAcessarRepositorioException(e.getMessage());
        }
    }

    @Override
    public ReservaEntity buscarReserva(Long id) {
        return reservaRepository.findById(id).orElseThrow();
    }

}
