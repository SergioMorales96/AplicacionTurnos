package com.asesoftware.semilla.ejercicio.service;

import com.asesoftware.semilla.ejercicio.dto.ResponseDTO;

public interface ITurnoService {
	
	public ResponseDTO consultarTurnoIdServicio(Integer turnoasociado);
	public ResponseDTO consultarTurnoNombreServicio(String nombreServicio);
	public ResponseDTO consultarTurnoIdComercio(Integer id);
	public ResponseDTO consultarTurnoNombreComercio(String nombreComercio);

}
