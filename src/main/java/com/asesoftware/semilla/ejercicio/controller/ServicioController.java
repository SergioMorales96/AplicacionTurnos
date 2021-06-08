package com.asesoftware.semilla.ejercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.semilla.ejercicio.entity.ComercioEntity;
import com.asesoftware.semilla.ejercicio.entity.ServicioEntity;
import com.asesoftware.semilla.ejercicio.service.IServicioService;

@RestController
@RequestMapping(path = "/api/v1/servicio")
public class ServicioController {
	
	@Autowired
	private IServicioService servicioService;
	
	// Listar Todo
	
	@GetMapping(path = "/todos")
	public List<ServicioEntity> consultarTodos(){
		return servicioService.getAll();
	}
	
	// Listar Uno
	
	@GetMapping(path = "/servicio/{id}")
	public ServicioEntity getServicioById(@PathVariable Integer id) {
		
		return servicioService.getServicioById(id);
	}
	
	// Crear
	// Editar
	// Eliminar

}
