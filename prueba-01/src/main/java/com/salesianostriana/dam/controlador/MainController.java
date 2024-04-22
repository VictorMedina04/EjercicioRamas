package com.salesianostriana.dam.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MainController {

	public String holaMundo(Model model) {
		model.addAttribute("mensaje", "Hola mundo");
		return "inicio";
	}

	public String alagos(Model model) {
		model.addAttribute("mensaje2", "Angel y Luismi los mejores profesores de todo salesianos ");
		return "inicio";
	}

}
