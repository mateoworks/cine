package edu.ucentral.cine.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salas")
public class Sala {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "int", length = 11)
	private Long id;
	
	@Column(name = "nombre_sala", length = 50)
	private String nombreSala;
	
	@Column(name = "numero_sillas", length = 3)
	private Integer numeroSillas;
	
	private double costo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}

	public Integer getNumeroSillas() {
		return numeroSillas;
	}

	public void setNumeroSillas(Integer numeroSillas) {
		this.numeroSillas = numeroSillas;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
}
