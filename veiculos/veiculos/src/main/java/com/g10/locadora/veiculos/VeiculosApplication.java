package com.g10.locadora.veiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class VeiculosApplication {

    public static void main(String[] args) {
        SpringApplication.run(VeiculosApplication.class, args);
    }



}
@RestController
class TesteController {
    @GetMapping("/status")
    public String status() { return "Veículos ON-LINE"; }
}