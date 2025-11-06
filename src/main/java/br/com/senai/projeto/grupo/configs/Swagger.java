package br.com.senai.projeto.grupo.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Projeto em Grupo",
        version = "1.0",
        description = "Davi Marques, Lara Cruz, Rafella Melo e Thalita Lisboa"
    )
)
public class Swagger {
    
}
