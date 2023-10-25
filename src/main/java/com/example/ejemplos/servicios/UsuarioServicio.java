package com.example.ejemplos.servicios;

import com.example.ejemplos.modelos.UsuarioEntityDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UsuarioServicio {
    public List<UsuarioEntityDto> obtenerTodos();
    public UsuarioEntityDto obtenerPorId(Integer id);
    public UsuarioEntityDto agregar(UsuarioEntityDto nuevoUsuario);
    public UsuarioEntityDto actualizar(UsuarioEntityDto usuarioActualizado);
    public UsuarioEntityDto eliminar(Integer id);
    public UsuarioEntityDto obtenerNombreApellido(String nombre, String apellido);
    public ResponseEntity<?> respuestaU(Object respuesta);
}
