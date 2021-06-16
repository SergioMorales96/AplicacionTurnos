package com.asesoftware.semilla.ejercicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.semilla.ejercicio.service.ITurnoService;

@RestController
@RequestMapping(path = "/api/v1/turno")
public class TurnoController {
	
	@Autowired
	private ITurnoService turnoService;

}
