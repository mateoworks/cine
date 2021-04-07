package edu.ucentral.cine.app.model;

import java.util.Date;
import java.util.List;


public class Pelicula {

	private Long id;


	private String titulo;


	private String urlPoster;


	private String sinopsis;


	private Integer anio;


	private Integer duracionMin;


	private Clasificacion clasificacion;


	private Date createAt;


	private List<Director> directores;
	

	private List<Director> generos;
	

	private List<Director> productoras;
	

	private List<Director> actores;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getUrlPoster() {
		return urlPoster;
	}

	public void setUrlPoster(String urlPoster) {
		this.urlPoster = urlPoster;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Integer getDuracionMin() {
		return duracionMin;
	}

	public void setDuracionMin(Integer duracionMin) {
		this.duracionMin = duracionMin;
	}

	public Clasificacion getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public List<Director> getDirectores() {
		return directores;
	}

	public void setDirectores(List<Director> directores) {
		this.directores = directores;
	}

	public List<Director> getGeneros() {
		return generos;
	}

	public void setGeneros(List<Director> generos) {
		this.generos = generos;
	}

	public List<Director> getProductoras() {
		return productoras;
	}

	public void setProductoras(List<Director> productoras) {
		this.productoras = productoras;
	}

	public List<Director> getActores() {
		return actores;
	}

	public void setActores(List<Director> actores) {
		this.actores = actores;
	}
	
}
