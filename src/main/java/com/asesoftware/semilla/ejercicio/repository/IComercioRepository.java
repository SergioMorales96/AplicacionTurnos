package com.asesoftware.semilla.ejercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.semilla.ejercicio.entity.ComercioEntity;

public interface IComercioRepository extends JpaRepository<ComercioEntity, Integer> {

}
