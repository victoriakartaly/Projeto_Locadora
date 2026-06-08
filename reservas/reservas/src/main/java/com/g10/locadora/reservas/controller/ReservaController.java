package com.g10.locadora.reservas.controller;

import com.g10.locadora.reservas.model.Reserva;
import com.g10.locadora.reservas.repository.ReservaRepository;
import com.g10.locadora.reservas.client.VeiculoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaRepository repository;

    @Autowired
    private VeiculoClient veiculoClient;

    @PostMapping
    public Reserva criar(@RequestBody Reserva reserva) {
        veiculoClient.buscarPorId(reserva.getIdVeiculo());
        return repository.save(reserva);
    }
}