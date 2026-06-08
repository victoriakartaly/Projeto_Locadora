package com.g10.locadora.veiculos.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private String placa;
    private Double valorDiaria;
    private Boolean disponivel = true;
}