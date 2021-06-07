package com.asesoftware.semilla.ejercicio.service;

import java.util.List;
import java.util.Optional;

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
	
	@Override
	public ComercioEntity getComercioById(Integer id) {
	
		Optional<ComercioEntity> optional = comercioRepository.findById(id);
		
		if (optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
		
	}
	
	@Override
	public ComercioEntity createComercio(ComercioEntity comercioEntity) {
	
		try {
			return comercioRepository.save(comercioEntity);
		}catch (Exception e) {
			return null;
		}
		
	}

}
