package com.reactive.reactivedemo.service.dto;

import lombok.Data;

@Data
public class PersonaDTO {

    String nombre;
    String apellido;
    Integer edad;
    CasaDTO casa;
}
