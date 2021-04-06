package edu.ucentral.cine.app.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "peliculas")
public class Pelicula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "int", length = 11)
	private Long id;

	@NotEmpty
	@Column(length = 100)
	private String titulo;

	@Column(name = "url_poster", length = 200)
	private String urlPoster;

	@Column(columnDefinition = "TEXT")
	private String sinopsis;

	@Column(columnDefinition = "YEAR")
	private Integer anio;

	@Column(name = "duracion_min", columnDefinition = "int", length = 4)
	private Integer duracionMin;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clasificacion_id", referencedColumnName = "id")
	private Clasificacion clasificacion;

	@Temporal(TemporalType.DATE)
	@Column(name = "create_at")
	private Date createAt;

	@JoinTable(
			name = "rel_pelicula_director",
			joinColumns = @JoinColumn(name = "pelicula_id", nullable = true),
			inverseJoinColumns = @JoinColumn(name="director_id", nullable = true)
			)
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Director> directores;
	
	@JoinTable(
			name = "rel_pelicula_genero",
			joinColumns = @JoinColumn(name = "pelicula_id", nullable = true),
			inverseJoinColumns = @JoinColumn(name="genero_id", nullable = true)
			)
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Director> generos;
	
	@JoinTable(
			name = "rel_pelicula_productora",
			joinColumns = @JoinColumn(name = "pelicula_id", nullable = true),
			inverseJoinColumns = @JoinColumn(name="productora_id", nullable = true)
			)
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Director> productoras;
	
	@JoinTable(
			name = "rel_pelicula_actor",
			joinColumns = @JoinColumn(name = "pelicula_id", nullable = true),
			inverseJoinColumns = @JoinColumn(name="actor_id", nullable = true)
			)
	@ManyToMany(cascade = CascadeType.ALL)
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
