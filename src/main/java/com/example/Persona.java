package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder

public abstract class Persona {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Genero genero;

}
