package com.asesoftware.semilla.ejercicio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.asesoftware.semilla.ejercicio.entity.TurnoEntity;

public interface ITurnoRepository extends JpaRepository<TurnoEntity, Integer>{
	
	@Query("SELECT t FROM TurnoEntity t WHERE t.turnoasociado = ?1 ")
	List<TurnoEntity> queryServicioAsociado(Integer turnoasociado);
	
	@Query("SELECT t FROM TurnoEntity t, ServicioEntity u WHERE t.turnoasociado = u.id AND u.nom_servicio like %?1% ")
	List<TurnoEntity> queryNombreServicioAsociado(String nombreServicio);

}