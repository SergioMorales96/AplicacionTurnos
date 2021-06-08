package com.asesoftware.semilla.ejercicio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.asesoftware.semilla.ejercicio.entity.ServicioEntity;
import com.asesoftware.semilla.ejercicio.repository.IServicioRepository;

@Service
public class ServicioService implements IServicioService{
	
	@Autowired
	private IServicioRepository servicioRepository;
	
	@Override
	public List<ServicioEntity> getAll(){
		
		return servicioRepository.findAll();
	}
	
	@Override
	public ServicioEntity getServicioById(Integer id) {
	
		Optional<ServicioEntity> optional = servicioRepository.findById(id);
		
		if (optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
	}
	
	@Override
	public ServicioEntity createServicio(ServicioEntity servicioEntity) {
	
		try {
			return servicioRepository.save(servicioEntity);
		}catch (Exception e) {
			return null;
		}
		
	}

}
