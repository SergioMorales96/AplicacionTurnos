package com.asesoftware.semilla.ejercicio.dto;

import java.sql.Time;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class TurnoDTO {
	
	private Integer id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "America/New_York")
	private Date fecha_turno;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss", timezone = "America/New_York")
	private Time hora_inicio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss", timezone = "America/New_York")
	private Time hora_fin;
	
	private String estado;
	
	private Integer turnoasociado;

}
