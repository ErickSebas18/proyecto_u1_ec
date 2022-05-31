package com.uce.edu.demo.concesionaria;

import org.springframework.stereotype.Component;

@Component
public class Automovil {

	private String modelo;
	private int año;
	private double precio;

	// SET Y GET
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
