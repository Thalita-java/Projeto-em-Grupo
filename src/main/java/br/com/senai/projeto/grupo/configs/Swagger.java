package br.com.senai.projeto.grupo.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Tiana",
        version = "1.0",
        description = "email para contato: tiana@gmail.com"
    )
)
public class Swagger {
    
}
