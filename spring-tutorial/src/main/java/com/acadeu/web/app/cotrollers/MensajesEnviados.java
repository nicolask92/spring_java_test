package com.acadeu.web.app.cotrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MensajesEnviados {

	@RequestMapping("enviados")
	public String login(Model model) {
		return "enviados";
	}
	
}
