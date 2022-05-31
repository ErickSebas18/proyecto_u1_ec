package com.uce.edu.demo.tienda;

import org.springframework.stereotype.Component;

@Component
public class Persona {

	private String nombre;
	private String numeroCedula;
	private String lugarDomicilio;

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", numeroCedula=" + numeroCedula + ", lugarDomicilio=" + lugarDomicilio
				+ "]";
	}

	// SET Y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroCedula() {
		return numeroCedula;
	}

	public void setNumeroCedula(String numeroCedula) {
		this.numeroCedula = numeroCedula;
	}

	public String getLugarDomicilio() {
		return lugarDomicilio;
	}

	public void setLugarDomicilio(String lugarDomicilio) {
		this.lugarDomicilio = lugarDomicilio;
	}

}
