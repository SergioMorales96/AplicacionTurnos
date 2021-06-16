package com.asesoftware.semilla.ejercicio.service;

import com.asesoftware.semilla.ejercicio.dto.ResponseDTO;
import com.asesoftware.semilla.ejercicio.dto.ServicioDTO;

public interface IServicioService {

	public ResponseDTO getAll();

	public ResponseDTO getServicioById(Integer id);

	public ResponseDTO createServicio(ServicioDTO servicioDTO);

	public ResponseDTO updateServicio(ServicioDTO servicioDTO);

	public ResponseDTO deleteServicio(Integer id);

}
