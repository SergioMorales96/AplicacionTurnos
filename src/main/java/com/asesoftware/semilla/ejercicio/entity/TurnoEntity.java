package com.asesoftware.semilla.ejercicio.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "turnos")
public class TurnoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_turno")
	private Integer id;
	
	@Column(name = "fecha_turno")
	private Time fecha_turno;
	
	@Column(name = "hora_inicio")
	private Time hora_inicio;
	
	@Column(name = "hora_fin")
	private Time hora_fin;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "fk_servicio")
	private String turnoasociado;
	

}
