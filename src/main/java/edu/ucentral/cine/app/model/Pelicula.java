package edu.ucentral.cine.app.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
}
