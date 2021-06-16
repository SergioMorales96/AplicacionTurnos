package com.asesoftware.semilla.ejercicio.service;

import com.asesoftware.semilla.ejercicio.dto.ComercioDTO;
import com.asesoftware.semilla.ejercicio.dto.ResponseDTO;

public interface IComercioService {
	
	public ResponseDTO getAll();
	
	public ResponseDTO getComercioById(Integer id);
	
	public ResponseDTO createComercio(ComercioDTO comercioDTO);
	
	public ResponseDTO updateComercio(ComercioDTO comercioDTO);
	
	public ResponseDTO deleteComercio(Integer id);

}
