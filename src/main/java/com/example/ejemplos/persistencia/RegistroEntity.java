package com.example.ejemplos.persistencia;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "registros")
public class RegistroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuario;
    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private EquipoEntity equipo;
    private Date entrada;
    private Date salida;
    private boolean usoEquipo;

}