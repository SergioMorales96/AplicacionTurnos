package com.asesoftware.semilla.ejercicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.asesoftware.semilla.ejercicio.dto.ResponseDTO;
import com.asesoftware.semilla.ejercicio.service.ITurnoService;

@RestController
@RequestMapping(path = "/api/v1/turno")
public class TurnoController {
	
	@Autowired
	private ITurnoService turnoService;
	
	// consultar turnos por id de servicio
	
	@GetMapping(path = "/servicio/{turnoasociado}")
	public ResponseDTO consultarTurnoIdServicio(@PathVariable Integer turnoasociado) {
		return turnoService.consultarTurnoIdServicio(turnoasociado);
	}
	
	// consultar turnos por nombre de servicio 
	
	@GetMapping(path = "/servicio")
	public ResponseDTO consultarTurnoNombreServicio(@RequestParam String nombreServicio) {
		return turnoService.consultarTurnoNombreServicio(nombreServicio);
	}

}
