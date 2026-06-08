package com.g10.locadora.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()

                .route("veiculos_route", r -> r.path("/veiculos/**")
                        .uri("lb://veiculos"))


                .route("reservas_route", r -> r.path("/reservas/**")
                        .uri("lb://reservas"))

                .build();
    }
}