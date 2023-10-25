package com.example.ejemplos.controladores;

import com.example.ejemplos.servicios.EquipoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipo")
public class EquipoControlador {
    private final EquipoServicio equipoServ;

    @Autowired
    public EquipoControlador(EquipoServicio equipoServ) {
        this.equipoServ = equipoServ;
    }
    @GetMapping("/todos")
    public ResponseEntity<?> obtTodos(){
        return equipoServ.respuestaE(equipoServ.obtenerTodos());
    }
}
