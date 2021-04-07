package edu.ucentral.cine.app.service;

import java.util.List;

import edu.ucentral.cine.app.model.Director;

public interface DirectorService {
	public List<Director> listarDirectores();
	public void guardarDirector(Director director);
	public void modificarDirector(Director director);
	public Director buscarDirectorPorId(Long id);
	public void eliminarDirectorPorId(Long id);
}
