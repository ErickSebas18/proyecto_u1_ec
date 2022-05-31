package com.uce.edu.demo.banco;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Ventanilla {

	private String nombreAsesor;
	private int numVentanilla;
	private LocalDateTime fechaPrestamo;
	private int cantidad;
	
	//SET Y GET
	public String getNombreAsesor() {
		return nombreAsesor;
	}
	public void setNombreAsesor(String nombreAsesor) {
		this.nombreAsesor = nombreAsesor;
	}
	public int getNumVentanilla() {
		return numVentanilla;
	}
	public void setNumVentanilla(int numVentanilla) {
		this.numVentanilla = numVentanilla;
	}
	public LocalDateTime getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(LocalDateTime fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
