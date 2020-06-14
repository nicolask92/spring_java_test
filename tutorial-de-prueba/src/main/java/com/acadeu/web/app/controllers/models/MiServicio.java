package com.acadeu.web.app.controllers.models;

import org.springframework.stereotype.Component;

@Component
public class MiServicio implements IServicio{
	
		public String operacion() {
		return "Hola";
	}
	
}
