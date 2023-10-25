package com.example.ejemplos.modelos;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
public class EquipoEntityDto implements Serializable {
    Integer id;
    boolean estado;
}