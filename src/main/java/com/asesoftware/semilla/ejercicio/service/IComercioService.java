package com.asesoftware.semilla.ejercicio.service;

import java.util.List;

import com.asesoftware.semilla.ejercicio.entity.ComercioEntity;

public interface IComercioService {
	
	public List<ComercioEntity> getAll();
	
	public ComercioEntity getComercioById(Integer id);
	
	public ComercioEntity createComercio(ComercioEntity comercioEntity);
	
	public ComercioEntity updateComercio(ComercioEntity comercioEntity);
	
	public void deleteComercio(Integer id);

}
