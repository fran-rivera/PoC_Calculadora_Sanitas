package com.frg.calculadora.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Clase configuración OpenAPI
 */
@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        Operation operation = new Operation();
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Calculadora REST API")
                        .description("Microservicio Calculadora Prueba Técnica Sanitas")
                        .contact(new Contact().name("Fran Rivera").email("frgar86@gmail.com").url("https://github.com/fran-rivera/PoC_Calculadora_Sanitas"))
                        .termsOfService("http://swagger.io/terms/")
                        .version("v1.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}