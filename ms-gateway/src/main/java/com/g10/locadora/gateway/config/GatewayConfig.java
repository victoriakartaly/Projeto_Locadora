package com.g10.locadora.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions.route;
import static org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions.http;
import static org.springframework.cloud.gateway.server.mvc.predicate.GatewayRequestPredicates.path;

@Configuration
public class GatewayConfig {

    @Bean
    public RouterFunction<ServerResponse> gatewayRouter() {
        return route("ms-veiculos")
                .route(path("/veiculos/**"), http("http://localhost:8081"))
                .build()
                .and(route("ms-reservas")
                        .route(path("/reservas/**"), http("http://localhost:8082"))
                        .build());
    }
}