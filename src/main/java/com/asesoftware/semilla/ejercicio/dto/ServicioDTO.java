package com.asesoftware.semilla.ejercicio.dto;

import java.sql.Time;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class ServicioDTO {
	
	private Integer id;
	
	private String nom_servicio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss", timezone = "America/New_York")
	private Time  hora_apertura;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss", timezone = "America/New_York")
	private Time hora_cierre;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss", timezone = "America/New_York")
	private Time duracion;
	
	private Integer servicioasociado;
	
	private List<TurnoDTO> turnos;

}
