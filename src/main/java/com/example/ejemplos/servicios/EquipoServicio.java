package com.example.ejemplos.servicios;

import com.example.ejemplos.modelos.EquipoEntityDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EquipoServicio {
    public List<EquipoEntityDto> obtenerTodos();
    public EquipoEntityDto obtenerPorId(Integer id);
    public EquipoEntityDto agregar(EquipoEntityDto nuevoUsuario);
    public EquipoEntityDto actualizar(EquipoEntityDto usuarioActualizado);
    public EquipoEntityDto eliminar(Integer id);
    public ResponseEntity<?> respuestaE(Object respuesta);
}
