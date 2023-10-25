package com.example.ejemplos.serviciosImp;

import com.example.ejemplos.modelos.UsuarioEntityDto;
import com.example.ejemplos.persistencia.UsuarioEntity;
import com.example.ejemplos.repositorios.UsuarioEntityRepository;
import com.example.ejemplos.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServicioImp implements UsuarioServicio {

    private final UsuarioEntityRepository  repoUsuario;

    @Autowired
    public UsuarioServicioImp(UsuarioEntityRepository repoUsuario) {
        this.repoUsuario = repoUsuario;
    }

    /**
     * @return
     */
    @Override
    public List<UsuarioEntityDto> obtenerTodos() {
        try {
            return obtenerTodosPrv();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private List<UsuarioEntityDto> obtenerTodosPrv() throws Exception {
        List<UsuarioEntity> todosLosU = repoUsuario.findAll();
        if (todosLosU.isEmpty()){
            throw new Exception("Fallo! No existen usuarios");
        } else {
            List<UsuarioEntityDto> todosLosUsuarios = new ArrayList<>();
            todosLosU.forEach((p)-> { todosLosUsuarios.add(UsuarioEntityDto.builder()
                    .id(p.getId()).nombre(p.getNombre()).apellido(p.getApellido())
                    .matricula(p.getMatricula()).rol(p.getRol()).build());
            });
            return todosLosUsuarios;
        }
    }
    /**
     * @param id
     * @return
     */
    @Override
    public UsuarioEntityDto obtenerPorId(Integer id) {
        return null;
    }

    /**
     * @param nuevoUsuario
     * @return
     */
    @Override
    public UsuarioEntityDto agregar(UsuarioEntityDto nuevoUsuario) {
        return null;
    }

    /**
     * @param usuarioActualizado
     * @return
     */
    @Override
    public UsuarioEntityDto actualizar(UsuarioEntityDto usuarioActualizado) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public UsuarioEntityDto eliminar(Integer id) {
        return null;
    }

    /**
     * @param nombre
     * @param apellido
     * @return
     */
    @Override
    public UsuarioEntityDto obtenerNombreApellido(String nombre, String apellido) {
        try {
            return obtenerNombreApellidoPrv(nombre, apellido);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public UsuarioEntityDto obtenerNombreApellidoPrv(String nombre, String apellido) throws Exception {
        UsuarioEntity usuario = repoUsuario.getUsuarioEntityByNombreAndApellido(nombre, apellido);
        if (usuario == null){
            throw new Exception("Fallo! No existe usuario");
        } else {
            return UsuarioEntityDto.builder()
                    .id(usuario.getId()).nombre(usuario.getNombre())
                    .apellido(usuario.getApellido()).rol(usuario.getRol())
                    .matricula(usuario.getMatricula()).build();
        }
    }

    /**
     * @param respuesta
     * @return
     */
    @Override
    public ResponseEntity<?> respuestaU(Object respuesta) {
        if (respuesta == null){
            return ResponseEntity.notFound().eTag("No se encontro recurso").build();
        } else {
            return ResponseEntity.ok(respuesta);
        }
    }

}
