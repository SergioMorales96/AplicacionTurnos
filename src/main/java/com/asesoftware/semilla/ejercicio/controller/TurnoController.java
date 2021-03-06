package com.asesoftware.semilla.ejercicio.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final Logger logger = LoggerFactory.getLogger(TurnoController.class);
	
	@Autowired
	private ITurnoService turnoService;
	
	// consultar turnos por id de servicio
	
	@GetMapping(path = "/servicio/{turnoasociado}")
	public ResponseDTO consultarTurnoIdServicio(@PathVariable Integer turnoasociado) {
		logger.info("ingreso al metodo para consultar turnos por id de servicio");
		return turnoService.consultarTurnoIdServicio(turnoasociado);
	}
	
	// consultar turnos por nombre de servicio 
	
	@GetMapping(path = "/servicio")
	public ResponseDTO consultarTurnoNombreServicio(@RequestParam String nombreServicio) {
		logger.info("ingreso al metodo para consultar turnos por nombre de servicio");
		return turnoService.consultarTurnoNombreServicio(nombreServicio);
	}
	
	// consultar turnos por id de comercio
	
	@GetMapping(path = "/comercio/{id}")
	public ResponseDTO consultarTurnoIdComercio(@PathVariable Integer id) {
		logger.info("ingreso al metodo para consultar turnos por id de comercio");
		return turnoService.consultarTurnoIdComercio(id);
	}
	
	// consultar turnos por nombre de comercio 
	
	@GetMapping(path = "/comercio")
	public ResponseDTO consultarTurnoNombreComercio(@RequestParam String nombreComercio) {
		logger.info("ingreso al metodo para consultar turnos por nombre de comercio");
		return turnoService.consultarTurnoNombreComercio(nombreComercio);
	}

}
