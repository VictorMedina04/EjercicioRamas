package com.salesianostriana.dam.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String holaMundo(Model model) {
		model.addAttribute("mensaje", "Hola mundo");
		return "inicio";
	}

	@GetMapping("/")
	public String alagos(Model model) {
		model.addAttribute("mensaje2", "Angel y Luismi los mejores profesores de todo salesianos ");
		return "inicio";
	}

}
