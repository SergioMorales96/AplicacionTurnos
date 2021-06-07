package com.asesoftware.semilla.ejercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.asesoftware.semilla.ejercicio.entity.ComercioEntity;
import com.asesoftware.semilla.ejercicio.service.IComercioService;

@RestController
@RequestMapping(path = "/api/v1/comercio")
public class ComercioController {
	
	@Autowired
	private IComercioService comercioService;
	
	// Listar Todo
	
	@GetMapping(path = "/all")
	public List<ComercioEntity> getAll(){
		
		return comercioService.getAll();
	}
	
	// Listar Uno
	// Crear 
	// Editar
	// Eliminar

}
