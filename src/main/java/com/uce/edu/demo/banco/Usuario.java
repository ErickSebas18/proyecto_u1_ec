package com.uce.edu.demo.banco;

import org.springframework.stereotype.Component;

@Component
public class Usuario {

	private String usuario;
	private String contrasenia;
	
	//SET Y GET
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	
	
}
