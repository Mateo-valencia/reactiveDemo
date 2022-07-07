package com.reactive.reactivedemo.service;

import com.reactive.reactivedemo.model.persona.Persona;
import com.reactive.reactivedemo.service.dto.PersonaCasaDTO;
import com.reactive.reactivedemo.service.dto.PersonaDTO;
import com.reactive.reactivedemo.service.dto.RespuestaPersonaDTO;
import com.reactive.reactivedemo.usecase.ProcesarPersonaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/persona")
@RequiredArgsConstructor
public class PersonaService {

    private final ProcesarPersonaUseCase procesarPersonaUseCase;

    @GetMapping("/buscar/{id}")
    public Mono<RespuestaPersonaDTO> buscarPersona(@PathVariable("id") String id){
        return procesarPersonaUseCase.buscarPersona(id);
    }

    @PostMapping("/crear")
    public Mono<Persona> crearPersona(@RequestBody PersonaDTO personaDTO){
        return procesarPersonaUseCase.crearPersona(personaDTO);
    }

    @GetMapping("/todos")
    public Flux<PersonaCasaDTO> buscarPersonas(){
        return procesarPersonaUseCase.buscarPersonas();
    }
}
