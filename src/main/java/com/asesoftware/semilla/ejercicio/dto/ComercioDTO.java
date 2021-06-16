package com.asesoftware.semilla.ejercicio.dto;

import java.util.List;
import lombok.Data;

@Data
public class ComercioDTO {
	
	private Integer id;
	
	private String nom_comercio;
	
	private Integer aforo_maximo;
	
	private List<ServicioDTO> servicios;

}
