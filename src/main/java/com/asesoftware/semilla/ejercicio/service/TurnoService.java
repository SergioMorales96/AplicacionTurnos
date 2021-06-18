package com.asesoftware.semilla.ejercicio.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.asesoftware.semilla.ejercicio.dto.ResponseDTO;
import com.asesoftware.semilla.ejercicio.dto.TurnoDTO;
import com.asesoftware.semilla.ejercicio.mapper.ITurnoMapper;
import com.asesoftware.semilla.ejercicio.repository.ITurnoRepository;

@Service
public class TurnoService implements ITurnoService{
	
	private static final Logger logger = LoggerFactory.getLogger(TurnoService.class);
	
	@Autowired
	private ITurnoRepository turnoRepository;
	
	@Autowired
	private ITurnoMapper mapperTurno;
	
	@Override
	public ResponseDTO consultarTurnoIdServicio(Integer turnoasociado) {
		logger.info("ingreso al metodo consultarTurnoIdServicio");
		List<TurnoDTO> lisTurnoDTOs = mapperTurno.listEntityToDto(turnoRepository.queryServicioAsociado(turnoasociado));
		return new ResponseDTO(lisTurnoDTOs, true, "ok", HttpStatus.OK);
	}
	
	@Override
	public ResponseDTO consultarTurnoNombreServicio(String nombreServicio) {
		logger.info("ingreso al metodo consultarTurnoNombreServicio");
		List<TurnoDTO> lisTurnoDTOs = mapperTurno.listEntityToDto(turnoRepository.queryNombreServicioAsociado(nombreServicio));
		return new ResponseDTO(lisTurnoDTOs, true, "ok", HttpStatus.OK);
	}
	
	public ResponseDTO consultarTurnoIdComercio(Integer id) {
		logger.info("ingreso al metodo consultarTurnoIdComercio");
		List<TurnoDTO> lisTurnoDTOs = mapperTurno.listEntityToDto(turnoRepository.queryNombreComercioAsociado(id));
		return new ResponseDTO(lisTurnoDTOs, true, "ok", HttpStatus.OK);
	}
	
	@Override
	public ResponseDTO consultarTurnoNombreComercio(String nombreComercio) {
		logger.info("ingreso al metodo consultarTurnoNombreComercio");
		List<TurnoDTO> lisTurnoDTOs = mapperTurno.listEntityToDto(turnoRepository.queryNombreComercio(nombreComercio));
		return new ResponseDTO(lisTurnoDTOs, true, "ok", HttpStatus.OK);
	}

}
