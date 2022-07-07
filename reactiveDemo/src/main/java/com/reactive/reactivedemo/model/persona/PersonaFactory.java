package com.reactive.reactivedemo.model.persona;

import com.reactive.reactivedemo.model.casa.CasaFactory;
import com.reactive.reactivedemo.service.dto.PersonaDTO;

import java.util.UUID;

public class PersonaFactory {

    public static Persona crearPersona(PersonaDTO personaDTO){
        return Persona.builder()
                .id(UUID.randomUUID().toString())
                .nombre(personaDTO.getNombre())
                .apellido(personaDTO.getApellido())
                .edad(personaDTO.getEdad())
                .casa(CasaFactory.crearCasa(personaDTO.getCasa()))
                .build();
    }
}
