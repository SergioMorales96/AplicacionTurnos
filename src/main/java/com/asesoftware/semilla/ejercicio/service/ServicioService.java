package com.asesoftware.semilla.ejercicio.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.asesoftware.semilla.ejercicio.dto.ResponseDTO;
import com.asesoftware.semilla.ejercicio.dto.ServicioDTO;
import com.asesoftware.semilla.ejercicio.entity.ServicioEntity;
import com.asesoftware.semilla.ejercicio.mapper.IServicioMapper;
import com.asesoftware.semilla.ejercicio.repository.IServicioRepository;

@Service
public class ServicioService implements IServicioService{

	@Autowired
	private IServicioRepository servicioRepository;

	@Autowired
	private IServicioMapper mapperServicio;

	@Override
	public ResponseDTO getAll(){

		return new ResponseDTO( mapperServicio.listEntityToDto( servicioRepository.findAll()), true, "ok", HttpStatus.OK);
	}

	@Override
	public ResponseDTO getServicioById(Integer id) {

		Optional<ServicioEntity> optional = servicioRepository.findById(id);

		if (optional.isPresent()) {
			return new ResponseDTO(optional.get(), true, "ok", HttpStatus.OK);
		}else {
			return  new ResponseDTO(null, false, "servicio no encontrado", HttpStatus.OK);
		}
	}

	@Override
	public ResponseDTO createServicio(ServicioDTO servicioDTO) {

		try {
			ServicioEntity servicioEntity = mapperServicio.dtoToEntity(servicioDTO);
			servicioRepository.save(servicioEntity);
			return new ResponseDTO(mapperServicio.entityToDto(servicioEntity), true, "ok", HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseDTO(null, false, "No se puede crear el servicio", HttpStatus.OK);
		}

	}

	@Override
	public ResponseDTO updateServicio(ServicioDTO servicioDTO) {

		ServicioEntity servicioEntity = mapperServicio.dtoToEntity(servicioDTO);
		servicioRepository.save(servicioEntity);
		return new ResponseDTO(mapperServicio.entityToDto(servicioEntity), true, "ok", HttpStatus.OK);
	}

	@Override
	public ResponseDTO deleteServicio(Integer id) {

		try {

			servicioRepository.deleteById(id);
			return  new ResponseDTO(null, true, "servicio eliminado", HttpStatus.OK);

		}catch (Exception e) {

			return  new ResponseDTO(null, false, "el servicio no se puede eliminar", HttpStatus.OK); 
		}

	}

}
