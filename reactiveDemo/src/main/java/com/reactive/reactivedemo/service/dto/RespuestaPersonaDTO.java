package com.reactive.reactivedemo.service.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RespuestaPersonaDTO {

    private Integer edad;
    private String direccionCasa;
}
