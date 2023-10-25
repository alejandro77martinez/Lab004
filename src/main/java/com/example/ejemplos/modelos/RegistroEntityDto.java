package com.example.ejemplos.modelos;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
@Data
@Builder
public class RegistroEntityDto implements Serializable {
    Integer id;
    UsuarioEntityDto usuario;
    EquipoEntityDto equipo;
    Date entrada;
    Date salida;
    boolean usoEquipo;
}