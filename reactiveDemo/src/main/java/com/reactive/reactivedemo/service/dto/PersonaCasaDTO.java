package com.reactive.reactivedemo.service.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.stereotype.Service;

@Data
@Builder
public class PersonaCasaDTO {

    private String nombre;
    private Integer estrato;
}
