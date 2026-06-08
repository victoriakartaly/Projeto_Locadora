package com.g10.locadora.reservas.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-veiculos", url = "http://localhost:8081/veiculos")
public interface VeiculoClient {
    @GetMapping("/{id}")
    Object buscarPorId(@PathVariable("id") Long id);
}
