package com.reactive.reactivedemo.model.casa;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;

@Builder(toBuilder = true)
@Getter
public class Casa {

    @Id
    private String id;
    private String direccion;
    private Integer estrato;
    private Integer habitaciones;
}
