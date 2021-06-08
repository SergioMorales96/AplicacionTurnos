package com.asesoftware.semilla.ejercicio.service;

import java.util.List;

import com.asesoftware.semilla.ejercicio.entity.ServicioEntity;

public interface IServicioService {
	
	public List<ServicioEntity> getAll();
	
	public ServicioEntity getServicioById(Integer id);

}
