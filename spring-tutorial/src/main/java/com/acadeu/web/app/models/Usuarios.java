package com.acadeu.web.app.models;

public class Usuarios {

	public String nombre;
	public String apellido;
	public String email;

	public String getNombre() {
		return nombre;
	}

	public Usuarios(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public Usuarios() {

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
