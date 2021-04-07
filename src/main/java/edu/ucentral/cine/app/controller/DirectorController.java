package edu.ucentral.cine.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ucentral.cine.app.model.Director;
import edu.ucentral.cine.app.service.DirectorService;

@Controller
@RequestMapping(value = "/directores")
public class DirectorController {
	
	@Autowired
	private DirectorService service;
	
	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List<Director> lista = service.listarDirectores();
		model.addAttribute("directores", lista);
		return "directores/index";
	}
	@GetMapping("/ver/{id}")
	public String buscarDirector(@PathVariable Long id, Model model) {
		Director director = service.buscarDirectorPorId(id);
		model.addAttribute("director", director);
		return "directores/formModificar";
	}
	@GetMapping("/crear")
	public String crearDirector() {
		return "directores/formDirector";
	}
	@PostMapping("/guardar")
	public String guardarDirector(Director director) {
		service.guardarDirector(director);
		return "redirect:/directores/index";
	}
	
	@PostMapping("/modificar")
	public String modificarDirector(Director director) {
		service.modificarDirector(director);
		return "redirect:/directores/index";
	}
	@GetMapping("/delete/{id}")
	public String eliminarDirector(@PathVariable Long id) {
		service.eliminarDirectorPorId(id);
		return "redirect:/directores/index";
	}
}
