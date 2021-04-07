package edu.ucentral.cine.app.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.ucentral.cine.app.model.Director;
@Service
public class DirectorServiceImpl implements DirectorService{
	
	private List<Director> lista;
	
	public DirectorServiceImpl() {
		lista = new ArrayList<>();
		Director director = new Director();
		director.setId(1L);
		director.setNombre("Juan");
		director.setApellidos("");
		director.setFechaNacimiento(new Date());
		director.setBiografia("");
		director.setFotoUrl("");
		lista.add(director);
		
		director = new Director();
		director.setId(2L);
		director.setNombre("Pedro");
		director.setApellidos("");
		director.setFechaNacimiento(new Date());
		director.setBiografia("");
		director.setFotoUrl("");
		lista.add(director);
		
		director = new Director();
		director.setId(3L);
		director.setNombre("Samanta");
		director.setApellidos("");
		director.setFechaNacimiento(new Date());
		director.setBiografia("");
		director.setFotoUrl("");
		lista.add(director);
	}

	@Override
	public List<Director> listarDirectores() {
		return lista;
	}

	@Override
	public void guardarVacante(Director director) {
		director.setId(lista.size() + 1L);
		lista.add(director);
	}

	@Override
	public void modificarVacante(Director director) {
		for(int i=0;i<lista.size();i++) {
			Director dir = lista.get(i);
			if(dir.getId() == director.getId()) {
				lista.set(i,director);
			}
		}
	}

	@Override
	public Director buscarVacantePorId(Long id) {
		for(Director director:lista) {
			if(director.getId()==id) {
				return director;
			}
		}
		return null;
	}

	@Override
	public void eliminarVacantePorId(Long id) {
		for(int i=0;i<lista.size();i++) {
			Director dir = lista.get(i);
			if(dir.getId() == id) {
				lista.remove(i);
			}
		}
	}

}
