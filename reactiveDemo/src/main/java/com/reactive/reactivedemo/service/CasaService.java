package com.reactive.reactivedemo.service;

import com.reactive.reactivedemo.model.casa.Casa;
import com.reactive.reactivedemo.model.persona.Persona;
import com.reactive.reactivedemo.model.persona.gateway.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/casa")
@RequiredArgsConstructor
public class CasaService {

    private final PersonaRepository personaRepository;

    @GetMapping("/buscar/{id}")
    public Mono<Casa> buscarCasa(@PathVariable("id") String id){
        return personaRepository.findByCasa_Id(id)
                .map(Persona::getCasa);
    }
}
