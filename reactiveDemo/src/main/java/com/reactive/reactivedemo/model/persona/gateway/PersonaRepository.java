package com.reactive.reactivedemo.model.persona.gateway;

import com.reactive.reactivedemo.model.persona.Persona;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonaRepository extends ReactiveMongoRepository<Persona,String> {

    Mono<Persona> findById(String id);
    Flux<Persona> findAll();
    Mono<Persona> findByCasa_Id(String id);
}
