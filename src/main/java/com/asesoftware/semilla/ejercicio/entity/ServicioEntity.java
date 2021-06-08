package com.asesoftware.semilla.ejercicio.entity;

import java.sql.Time;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	private String nom_servicio;
	
	@Column(name = "hora_apertura")
	private Time  hora_apertura;
	
	@Column(name = "hora_cierre")
	private Time hora_cierre;
	
	@Column(name = "duracion")
	private Time duracion;
	
	@Column(name = "fk_comercio")
	private String servicioasociado;
	
	@OneToMany(mappedBy = "turnoasociado")
	private List<TurnoEntity> turnos;
	

}
