package edu.ucentral.cine.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "productoras")
public class Productora {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "int", length = 11)
	private Long id;
	
	@NotEmpty
	@Column(name = "nombre_productora", length = 100)
	private String nombreProductora;
	
	@Column(columnDefinition = "TEXT")
	private String descripcion;
	
	@Column(name = "url_logo", length = 200)
	private String urlLogo;
	
	@ManyToMany(mappedBy = "productoras")
    private List<Pelicula> peliculas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreProductora() {
		return nombreProductora;
	}

	public void setNombreProductora(String nombreProductora) {
		this.nombreProductora = nombreProductora;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrlLogo() {
		return urlLogo;
	}

	public void setUrlLogo(String urlLogo) {
		this.urlLogo = urlLogo;
	}
	
}
