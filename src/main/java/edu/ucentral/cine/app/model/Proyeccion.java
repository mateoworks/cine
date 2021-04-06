package edu.ucentral.cine.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proyeccion")
public class Proyeccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "int", length = 11)
	private Long id;
	
	private Date fecha;
	
	@Column(name = "inicio_proyeccion", columnDefinition = "time")
	private String inicioProyeccion;
	
	//Pelicula
	//Sala
	//Horario
}
