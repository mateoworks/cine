package edu.ucentral.cine.app.service;

import java.util.List;

import edu.ucentral.cine.app.model.Director;

public interface DirectorService {
	public List<Director> listarDirectores();
	public void guardarVacante(Director director);
	public void modificarVacante(Director director);
	public Director buscarVacantePorId(Long id);
	public void eliminarVacantePorId(Long id);
}
