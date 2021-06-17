package com.asesoftware.semilla.ejercicio.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.asesoftware.semilla.ejercicio.dto.ResponseDTO;
import com.asesoftware.semilla.ejercicio.dto.TurnoDTO;
import com.asesoftware.semilla.ejercicio.mapper.ITurnoMapper;
import com.asesoftware.semilla.ejercicio.repository.ITurnoRepository;

@Service
public class TurnoService implements ITurnoService{
	
	@Autowired
	private ITurnoRepository turnoRepository;
	
	@Autowired
	private ITurnoMapper mapperTurno;
	
	@Override
	public ResponseDTO consultarTurnoIdServicio(Integer turnoasociado) {
		
		List<TurnoDTO> lisTurnoDTOs = mapperTurno.listEntityToDto(turnoRepository.queryServicioAsociado(turnoasociado));
		return new ResponseDTO(lisTurnoDTOs, true, "ok", HttpStatus.OK);
	}
	
	@Override
	public ResponseDTO consultarTurnoNombreServicio(String nombreServicio) {
		
		List<TurnoDTO> lisTurnoDTOs = mapperTurno.listEntityToDto(turnoRepository.queryNombreServicioAsociado(nombreServicio));
		return new ResponseDTO(lisTurnoDTOs, true, "ok", HttpStatus.OK);
	}

}
