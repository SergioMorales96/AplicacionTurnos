package com.asesoftware.semilla.ejercicio.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "servicios")
public class ServicioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_servicio")
	private Integer id;
	
	@Column(name = "nom_servicio")
	private String nomservicio;
	
	@Column(name = "hora_apertura")
	private Date  horaapertura;
	
	@Column(name = "hora_cierre")
	private Date horacierre;
	
	@Column(name = "duracion")
	private Date duracion;
	
	@Column(name = "fk_comercio")
	private String servicioasociado;
	

}
