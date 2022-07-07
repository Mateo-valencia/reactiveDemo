package com.reactive.reactivedemo.usecase;

import com.reactive.reactivedemo.model.casa.Casa;
import com.reactive.reactivedemo.model.persona.Persona;
import com.reactive.reactivedemo.model.persona.PersonaFactory;
import com.reactive.reactivedemo.model.persona.gateway.PersonaRepository;
import com.reactive.reactivedemo.service.dto.PersonaCasaDTO;
import com.reactive.reactivedemo.service.dto.PersonaDTO;
import com.reactive.reactivedemo.service.dto.RespuestaPersonaDTO;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Objects;

@RequiredArgsConstructor
public class ProcesarPersonaUseCase {

    private final PersonaRepository personaRepository;

    public Mono<RespuestaPersonaDTO> buscarPersona(String id){
        return personaRepository.findById(id)
                .switchIfEmpty(Mono.error(new Throwable("Not found")))
                .map(persona ->
                    RespuestaPersonaDTO.builder()
                            .edad(persona.getEdad())
                            .direccionCasa(persona.getCasa().getDireccion())
                            .build()
                );
    }

    public Mono<Persona> crearPersona(PersonaDTO personaDTO){
        return personaRepository.save(PersonaFactory.crearPersona(personaDTO))
                .switchIfEmpty(Mono.error(new Throwable("Error Saving Person.")));
    }

    public Flux<PersonaCasaDTO> buscarPersonas(){
        return personaRepository.findAll()
                .map(this::construirPersonaCasaDTO);
    }

    private PersonaCasaDTO construirPersonaCasaDTO(Persona persona) {
        return PersonaCasaDTO.builder()
                .nombre(persona.getNombre())
                .estrato(persona.getCasa().getEstrato())
                .build();
    }
}
