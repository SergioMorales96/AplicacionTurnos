package com.asesoftware.semilla.ejercicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.asesoftware.semilla.ejercicio.dto.ComercioDTO;
import com.asesoftware.semilla.ejercicio.dto.ResponseDTO;
import com.asesoftware.semilla.ejercicio.service.IComercioService;

@RestController
@RequestMapping(path = "/api/v1/comercio")
public class ComercioController {
	
	@Autowired
	private IComercioService comercioService;
	
	// Listar Todo
	
	@GetMapping(path = "/all")
	public ResponseDTO getAll(){
		
		return comercioService.getAll();
	}
	
	// Listar Uno
	
	@GetMapping(path = "/comercio/{id}")
	public ResponseDTO getComercioById(@PathVariable Integer id) {
		
		return comercioService.getComercioById(id);
	}
	
	@GetMapping(path = "/comercio")
	public ResponseDTO getComercioParametroById(@RequestParam Integer id) {
		
		return comercioService.getComercioById(id);
	}
	// Crear 
	
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ResponseDTO createComercio(@RequestBody ComercioDTO entity) {
		
		return comercioService.createComercio(entity);
	}
	
	// Editar
	
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public ResponseDTO editarComercio(@RequestBody ComercioDTO entity) {
		
		return comercioService.updateComercio(entity);
	}
	
	// Eliminar
	
	@GetMapping(path = "/delete/{id}")
	public ResponseDTO eliminarComercio(@PathVariable Integer id) {
		
		return comercioService.deleteComercio(id);
	}

}
