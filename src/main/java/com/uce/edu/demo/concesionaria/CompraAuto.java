package com.uce.edu.demo.concesionaria;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraAuto {

	// 1. DI POR ATRIBUTOS

	@Autowired
	private Automovil auto;
	@Autowired
	private Cliente cliente;
	private LocalDateTime fechaCompra;

	public String comprar(String nombre, String apellido, int numeroCelular, String modelo, int año, double precio,
			LocalDateTime fechaCompra) {

		this.cliente.setNombre(nombre);
		this.cliente.setApellido(apellido);
		this.cliente.setNumeroCelular(numeroCelular);

		this.auto.setModelo(modelo);
		this.auto.setAño(año);
		this.auto.setPrecio(precio);

		this.fechaCompra = fechaCompra;

		// Agregando Compra
		return "Se ha registrado la compra";
	}

	// SET Y GET
	public Automovil getAuto() {
		return auto;
	}

	public void setAuto(Automovil auto) {
		this.auto = auto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

}
