package edu.ucentral.cine.app.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		director.setNombre("Quentin Jerome");
		director.setApellidos("Tarantino");
		Date d = null;
		try {
			d = new SimpleDateFormat("yyyy-MM-dd").parse("1963-03-27");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		director.setFechaNacimiento(d);
		director.setBiografia(
				"Su carrera comenzó a finales de la década de 1980, cuando escribió y dirigió My Best Friend's Birthday "
						+ "—cortometraje cuyo guion sería la base del argumento de la película True Romance, de Tony Scott (1993)—. "
						+ "En 1992 inició su carrera como cineasta independiente con el estreno de Reservoir Dogs, considerada por la "
						+ "revista Empire como «la mejor película independiente de todos los tiempos».[cita requerida] Su popularidad "
						+ "no hizo sino crecer con su segundo largometraje, Pulp Fiction (1994), una comedia negra antológica que "
						+ "se convirtió en un enorme éxito de crítica y público, además de una pieza fundamental de la cultura popular "
						+ "El semanario Entertainment Weekly la designó como la mejor película estrenada entre 1983 y 2008, y "
						+ "algunos críticos del British Film Institute la colocaron en el número 127 de las mejores películas de "
						+ "todos los tiempos.2​3​ En Jackie Brown (1997), Tarantino rindió homenaje al género blaxploitation.");
		director.setFotoUrl("Quentin_Tarantino.jpg");
		lista.add(director);

		director = new Director();
		director.setId(2L);
		director.setNombre("Steven Allan");
		director.setApellidos("Spielberg");
		try {
			d = new SimpleDateFormat("yyyy-MM-dd").parse("1946-12-18");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		director.setFechaNacimiento(d);
		director.setBiografia(
				"En sus películas, Spielberg ha tratado temas y géneros muy diversos. Sus primeros filmes "
				+ "de ciencia ficción y aventuras, como Tiburón (1975), Close Encounters of the Third Kind (1977), "
				+ "la franquicia de Indiana Jones y E.T., el extraterrestre (1982), son considerados arquetipos "
				+ "del cine de evasión del Hollywood moderno. En años posteriores comenzó a abordar temas humanistas "
				+ "como el Holocausto, el comercio atlántico de esclavos, los derechos civiles y políticos, "
				+ "la guerra y el terrorismo en películas como El color púrpura (1985), El imperio del sol (1987), "
				+ "La lista de Schindler (1993), Amistad (1997), Saving Private Ryan (1998), Múnich (2005), "
				+ "War Horse (2011), Lincoln (2012) o El puente de los espías (2015)."
				);
		director.setFotoUrl("Steven_Spielberg.jpg");
		lista.add(director);

		director = new Director();
		director.setId(3L);
		director.setNombre("Guillermo");
		director.setApellidos("del Toro Gómez");
		try {
			d = new SimpleDateFormat("yyyy-MM-dd").parse("1964-10-09");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		director.setFechaNacimiento(d);
		director.setBiografia(
				"Comenzó a filmar en México desde adolescente, cuando estaba en el Instituto de Ciencias, "
				+ "en la ciudad de Guadalajara. Pasó diez años en diseño de maquillaje y formó su propia compañía, "
				+ "Necropia, antes de poder ser el productor ejecutivo de su primer filme a los 21 años."
				+ " Fue cofundador del Festival de Cine de Guadalajara y creó la compañía de producción Tequila Gang."
				);
		director.setFotoUrl("Guillermo_del_Toro.jpg");
		lista.add(director);
	}

	@Override
	public List<Director> listarDirectores() {
		return lista;
	}

	@Override
	public void guardarDirector(Director director) {
		director.setId(lista.size() + 1L);
		lista.add(director);
	}

	@Override
	public void modificarDirector(Director director) {
		for(int i=0;i<lista.size();i++) {
			Director dir = lista.get(i);
			if(dir.getId() == director.getId()) {
				lista.set(i,director);
			}
		}
	}

	@Override
	public Director buscarDirectorPorId(Long id) {
		for(Director director:lista) {
			if(director.getId()==id) {
				return director;
			}
		}
		return null;
	}

	@Override
	public void eliminarDirectorPorId(Long id) {
		for(int i=0;i<lista.size();i++) {
			Director dir = lista.get(i);
			if(dir.getId() == id) {
				lista.remove(i);
			}
		}
	}

}
