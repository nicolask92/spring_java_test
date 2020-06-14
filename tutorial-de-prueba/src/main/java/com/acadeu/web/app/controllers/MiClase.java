package com.acadeu.web.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiClase {
	
	@Autowired
	private Iservicio servicio;
	
	@GetMapping({"/","","/index"})
	public String index(Model model) {
		return ("index");
	}
	
}
