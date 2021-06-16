package com.asesoftware.semilla.ejercicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.asesoftware.semilla.ejercicio.dto.ResponseDTO;
import com.asesoftware.semilla.ejercicio.dto.ServicioDTO;
import com.asesoftware.semilla.ejercicio.service.IServicioService;

@RestController
@RequestMapping(path = "/api/v1/servicio")
public class ServicioController {
	
	@Autowired
	private IServicioService servicioService;
	
	// Listar Todo
	
	@GetMapping(path = "/all")
	public ResponseDTO consultarTodos(){
		return servicioService.getAll();
	}
	
	// Listar Uno
	
	@GetMapping(path = "/servicio/{id}")
	public ResponseDTO getServicioById(@PathVariable Integer id) {
		
		return servicioService.getServicioById(id);
	}
	
	@GetMapping(path = "/servicio")
	public ResponseDTO getServicioParametroById(@RequestParam Integer id) {
		
		return servicioService.getServicioById(id);
	}
	
	// Crear
	
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ResponseDTO createServicio(@RequestBody ServicioDTO servicioDTO) {
		
		return servicioService.createServicio(servicioDTO);
	}
	
	// Editar
	
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public ResponseDTO editarServicio(@RequestBody ServicioDTO servicioDTO) {
		
		return servicioService.updateServicio(servicioDTO);
	}
	
	// Eliminar
	
	@GetMapping(path = "/delete/{id}")
	public ResponseDTO eliminarServicio(@PathVariable Integer id) {
		
		return servicioService.deleteServicio(id);
	}

}
