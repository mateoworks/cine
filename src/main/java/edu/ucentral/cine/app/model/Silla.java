package edu.ucentral.cine.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sillas")
public class Silla {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "int", length = 11)
	private Long id;
	
	@Column(columnDefinition = "int", length = 3)
	private Integer fila;
	
	@Column(columnDefinition = "int", length = 3)
	private Integer columna;
	
	//Sala
	
}
