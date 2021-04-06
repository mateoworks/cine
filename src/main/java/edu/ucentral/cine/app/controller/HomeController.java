package edu.ucentral.cine.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
	@GetMapping("/")
	public String inicio(Model model) {
		String mensaje = "Pagina de inicio cambios desde git!!!!!!!!!!!!!!!";
		model.addAttribute("mensaje", mensaje);
		return "home";	
	}
}
