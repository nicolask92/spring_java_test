package com.acadeu.web.app.cotrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NuevoMensaje {
	
	@RequestMapping("nuevo_mensaje")
	public String login(Model model) {
		return "nuevo-mensaje";
	}
	
}
