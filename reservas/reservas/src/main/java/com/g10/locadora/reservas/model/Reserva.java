package com.g10.locadora.reservas.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idVeiculo;
    private String nomeCliente;
    private LocalDate dataInicio;
    private LocalDate dataFim;
}