package com.fiap.restaurante.controller;

import com.fiap.restaurante.core.usecase.dto.ReservaDTO;
import com.fiap.restaurante.core.usecase.CancelarReservaUseCase;
import com.fiap.restaurante.core.usecase.ReservarMesaUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reserva")
public class ReservaController {
    @Autowired
    private ReservarMesaUseCase reservarMesaUseCase;
    @Autowired
    private CancelarReservaUseCase cancelarReservaUseCase;

    @PostMapping
    public ResponseEntity<ReservaDTO> reservarMesa(@Valid @RequestBody ReservaDTO reservaDTO) {
        reservaDTO = reservarMesaUseCase.reservarMesa(reservaDTO);
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(reservaDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelarReserva(@PathVariable Long id) {
        cancelarReservaUseCase.cancelarReserva(id);
        return ResponseEntity.noContent().build();
    }
}
