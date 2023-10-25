package com.example.ejemplos.repositorios;

import com.example.ejemplos.persistencia.RegistroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroEntityRepository extends JpaRepository<RegistroEntity, Integer> {
}