package com.asesoftware.semilla.ejercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.asesoftware.semilla.ejercicio.entity.TurnoEntity;

public interface ITurnoRepository extends JpaRepository<TurnoEntity, Integer>{

}