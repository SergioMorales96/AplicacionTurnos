package com.asesoftware.semilla.ejercicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.semilla.ejercicio.entity.ComercioEntity;
import com.asesoftware.semilla.ejercicio.repository.IComercioRepository;

@Service
public class ComercioService implements IComercioService{
	
	@Autowired
	private IComercioRepository comercioRepository;
	
	@Override
	public List<ComercioEntity> getAll(){
		
		return comercioRepository.findAll();
	}

}
