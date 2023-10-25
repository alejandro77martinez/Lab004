package com.example.ejemplos.controladores;

import com.example.ejemplos.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {
    private final UsuarioServicio usuarioServ;

    @Autowired
    public UsuarioControlador(UsuarioServicio usuarioServicio) {
        this.usuarioServ = usuarioServicio;
    }

    @GetMapping("/todos")
    public ResponseEntity<?> obtTodos(){
        return usuarioServ.respuestaU(usuarioServ.obtenerTodos());
    }

    @PostMapping("/{nombre}")
    public ResponseEntity<?> obtNombreApellido(@PathVariable String nombre, @RequestBody String apellido){
        return usuarioServ.respuestaU(usuarioServ.obtenerNombreApellido(nombre,apellido));
    }
}
