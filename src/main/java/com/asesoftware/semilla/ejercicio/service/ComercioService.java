package com.asesoftware.semilla.ejercicio.service;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.asesoftware.semilla.ejercicio.dto.ComercioDTO;
import com.asesoftware.semilla.ejercicio.dto.ResponseDTO;
import com.asesoftware.semilla.ejercicio.entity.ComercioEntity;
import com.asesoftware.semilla.ejercicio.mapper.IComercioMapper;
import com.asesoftware.semilla.ejercicio.repository.IComercioRepository;

@Service
public class ComercioService implements IComercioService{
	
	private static final Logger logger = LoggerFactory.getLogger(ComercioService.class);

	@Autowired
	private IComercioRepository comercioRepository;
	
	@Autowired
	private IComercioMapper mapperComercio;

	@Override
	public ResponseDTO getAll(){
		logger.info("ingreso al metodo getAll");
		return new ResponseDTO( mapperComercio.listEntityToDto( comercioRepository.findAll()), true, "ok", HttpStatus.OK);
	}

	@Override
	public ResponseDTO getComercioById(Integer id) {
		logger.info("ingreso al metodo getComercioById");
		Optional<ComercioEntity> optional = comercioRepository.findById(id);

		if (optional.isPresent()) {
			return new ResponseDTO(optional.get(), true, "ok", HttpStatus.OK);
		}else {
			return  new ResponseDTO(null, false, "Comercio no encontrado", HttpStatus.OK);
		}
	}

	@Override
	public ResponseDTO createComercio(ComercioDTO comercioDTO) {
		logger.info("ingreso al metodo createComercio");
		try {
			ComercioEntity comercioEntity = mapperComercio.dtoToEntity(comercioDTO);
			comercioRepository.save(comercioEntity);
			return new ResponseDTO(mapperComercio.entityToDto(comercioEntity), true, "ok", HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseDTO(null, false, "No se puede crear el comercio", HttpStatus.OK);
		}

	}

	@Override
	public ResponseDTO updateComercio(ComercioDTO comercioDTO) {
		logger.info("ingreso al metodo updateComercio");
		ComercioEntity comercioEntity = mapperComercio.dtoToEntity(comercioDTO);
		comercioRepository.save(comercioEntity);
		return new ResponseDTO(mapperComercio.entityToDto(comercioEntity), true, "ok", HttpStatus.OK);
	}

	@Override
	public ResponseDTO deleteComercio(Integer id) {
		logger.info("ingreso al metodo deleteComercio");
		try {

			comercioRepository.deleteById(id);
			return  new ResponseDTO(null, true, "comercio eliminado", HttpStatus.OK);

		}catch (Exception e) {

			return  new ResponseDTO(null, false, "el comercio no se puede eliminar", HttpStatus.OK); 
		}
	}


}
