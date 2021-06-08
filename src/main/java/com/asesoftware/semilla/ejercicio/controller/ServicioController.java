package com.asesoftware.semilla.ejercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.asesoftware.semilla.ejercicio.entity.ServicioEntity;
import com.asesoftware.semilla.ejercicio.service.IServicioService;

@RestController
@RequestMapping(path = "/api/v1/servicio")
public class ServicioController {
	
	@Autowired
	private IServicioService servicioService;
	
	// Listar Todo
	
	@GetMapping(path = "/all")
	public List<ServicioEntity> consultarTodos(){
		return servicioService.getAll();
	}
	
	// Listar Uno
	
	@GetMapping(path = "/servicio/{id}")
	public ServicioEntity getServicioById(@PathVariable Integer id) {
		
		return servicioService.getServicioById(id);
	}
	
	@GetMapping(path = "/servicio")
	public ServicioEntity getServicioParametroById(@RequestParam Integer id) {
		
		return servicioService.getServicioById(id);
	}
	
	// Crear
	
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ServicioEntity createServicio(@RequestBody ServicioEntity entity) {
		
		return servicioService.createServicio(entity);
	}
	
	// Editar
	
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public ServicioEntity editarServicio(@RequestBody ServicioEntity entity) {
		
		return servicioService.updateServicio(entity);
	}
	
	// Eliminar
	
	@GetMapping(path = "/delete/{id}")
	public void eliminarServicio(@PathVariable Integer id) {
		
		servicioService.deleteServicio(id);
	}

}
