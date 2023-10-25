package com.example.ejemplos.modelos;

import lombok.*;

import java.io.Serializable;
@Data
@Builder
public class UsuarioEntityDto implements Serializable {
    Integer id;
    String matricula;
    String nombre;
    String apellido;
    String rol;
}