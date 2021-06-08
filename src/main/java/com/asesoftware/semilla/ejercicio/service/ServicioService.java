package com.asesoftware.semilla.ejercicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.semilla.ejercicio.entity.ServicioEntity;
import com.asesoftware.semilla.ejercicio.repository.IServicioRepository;

@Service
public class ServicioService implements IServicioService{
	
	@Autowired
	private IServicioRepository servicioRepository;
	
	
	public List<ServicioEntity> getAll(){
		
		return servicioRepository.findAll();
	}

}
