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
	
	@GetMapping(path = "/comercio/{id}")
	public ComercioEntity getComercioById(@PathVariable Integer id) {
		
		return comercioService.getComercioById(id);
	}
	
	@GetMapping(path = "/comercio")
	public ComercioEntity getComercioParametroById(@RequestParam Integer id) {
		
		return comercioService.getComercioById(id);
	}
	// Crear 
	
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ComercioEntity createComercio(@RequestBody ComercioEntity entity) {
		
		return comercioService.createComercio(entity);
	}
	
	// Editar
	
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public ComercioEntity editarComercio(@RequestBody ComercioEntity entity) {
		
		return comercioService.updateComercio(entity);
	}
	
	// Eliminar
	
	@GetMapping(path = "/delete/{id}")
	public void eliminarComercio(@PathVariable Integer id) {
		
		comercioService.deleteComercio(id);
	}

}
