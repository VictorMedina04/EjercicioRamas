package com.salesianostriana.dam.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String holaMundo(Model model) {
		model.addAttribute("mensaje", "Luismi y Ángel los mejores");
		return "inicio";
	}

}
