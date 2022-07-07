package com.reactive.reactivedemo.model.casa;

import com.reactive.reactivedemo.service.dto.CasaDTO;

import java.util.UUID;

public class CasaFactory {

    public static Casa crearCasa(CasaDTO casaDTO){
        return Casa.builder()
                .id(UUID.randomUUID().toString())
                .direccion(casaDTO.getDireccion())
                .estrato(casaDTO.getEstrato())
                .habitaciones(casaDTO.getHabitaciones())
                .build();
    }
}
