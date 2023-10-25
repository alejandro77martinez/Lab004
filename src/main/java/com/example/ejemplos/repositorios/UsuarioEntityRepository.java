package com.example.ejemplos.repositorios;

import com.example.ejemplos.persistencia.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioEntityRepository extends JpaRepository<UsuarioEntity, Integer> {
    UsuarioEntity getUsuarioEntityByNombreAndApellido(String nombre, String apellido);
}