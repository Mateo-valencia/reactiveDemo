package com.reactive.reactivedemo.model.persona;

import com.reactive.reactivedemo.model.casa.Casa;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder(toBuilder = true)
@Getter
@Document(collection = "persona")
public class Persona {

    @Id
    private String id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private Casa casa;
}
