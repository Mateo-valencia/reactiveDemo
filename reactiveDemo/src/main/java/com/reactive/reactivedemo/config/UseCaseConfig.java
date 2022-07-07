package com.reactive.reactivedemo.config;

import com.reactive.reactivedemo.model.persona.gateway.PersonaRepository;
import com.reactive.reactivedemo.usecase.ProcesarPersonaUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public ProcesarPersonaUseCase buscarPersonaUseCase (PersonaRepository personaRepository){
        return new ProcesarPersonaUseCase(personaRepository);
    }
}
