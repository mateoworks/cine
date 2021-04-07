package edu.ucentral.cine.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	@GetMapping("/crear")
	public String crearVacante() {
		return "directores/formDirector";
	}
}
