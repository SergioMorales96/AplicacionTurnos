package com.asesoftware.semilla.ejercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.asesoftware.semilla.ejercicio.entity.ServicioEntity;

public interface IServicioRepository extends JpaRepository<ServicioEntity, Integer>{

}
