package com.uce.edu.demo.tienda;

import org.springframework.stereotype.Service;

@Service
public class Tienda {

	private Persona persona;
	private Carrito carrito;

	//2. DI POR CONSTRUCTOR
	public Tienda(Persona persona, Carrito carrito) {
		this.persona = persona;
		this.carrito = carrito;

	}

	public double pagar(String nombre, String numeroCedula, String lugarDomicilio, String nombreProducto, String codigo,
			double precio, int cantidad) {

		this.persona.setNombre(nombre);
		this.persona.setNumeroCedula(numeroCedula);
		this.persona.setLugarDomicilio(lugarDomicilio);

		this.carrito.setNombreProducto(nombreProducto);
		this.carrito.setCodigo(codigo);
		this.carrito.setPrecio(precio);
		this.carrito.setCantidad(cantidad);

		return precio * cantidad;

	}

	@Override
	public String toString() {
		return "Factura \n[cliente=" + persona + ", \ncarrito=" + carrito + "]";
	}

	// SET Y GET
	public Persona getCliente() {
		return persona;
	}

	public void setCliente(Persona persona) {
		this.persona = persona;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

}
