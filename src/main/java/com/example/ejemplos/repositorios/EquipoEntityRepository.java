package com.example.ejemplos.repositorios;

import com.example.ejemplos.persistencia.EquipoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoEntityRepository extends JpaRepository<EquipoEntity, Integer> {
}