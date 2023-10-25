package com.example.ejemplos.serviciosImp;

import com.example.ejemplos.modelos.EquipoEntityDto;
import com.example.ejemplos.persistencia.EquipoEntity;
import com.example.ejemplos.repositorios.EquipoEntityRepository;
import com.example.ejemplos.servicios.EquipoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EquipoServicioImp implements EquipoServicio {

    private final EquipoEntityRepository repoEquipo;

    @Autowired
    public EquipoServicioImp(EquipoEntityRepository repoEquipo) {
        this.repoEquipo = repoEquipo;
    }

    /**
     * @return
     */
    @Override
    public List<EquipoEntityDto> obtenerTodos() {
        try {
            return obtenerTodosPrv();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private List<EquipoEntityDto> obtenerTodosPrv() throws Exception {
        List<EquipoEntity> todosLosE = repoEquipo.findAll();
        if (todosLosE.isEmpty()){
            throw new Exception("Fallo! No existen equipos");
        } else {
            List<EquipoEntityDto> todosLosEquipos = new ArrayList<>();
            todosLosE.forEach((p)-> { todosLosEquipos.add(EquipoEntityDto.builder()
                    .id(p.getId()).estado(p.isEstado()).build());
            });
            return todosLosEquipos;
        }
    }

    /**
     * @param id
     * @return
     */
    @Override
    public EquipoEntityDto obtenerPorId(Integer id) {
        return null;
    }

    /**
     * @param nuevoUsuario
     * @return
     */
    @Override
    public EquipoEntityDto agregar(EquipoEntityDto nuevoUsuario) {
        return null;
    }

    /**
     * @param usuarioActualizado
     * @return
     */
    @Override
    public EquipoEntityDto actualizar(EquipoEntityDto usuarioActualizado) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public EquipoEntityDto eliminar(Integer id) {
        return null;
    }

    /**
     * @param respuesta
     * @return
     */
    @Override
    public ResponseEntity<?> respuestaE(Object respuesta) {
        if (respuesta == null){
            return ResponseEntity.notFound().eTag("No se encontro recurso").build();
        } else {
            return ResponseEntity.ok(respuesta);
        }
    }
}
