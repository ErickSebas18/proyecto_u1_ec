package com.uce.edu.demo.tienda;

import org.springframework.stereotype.Component;

@Component
public class Carrito {

	private String nombreProducto;
	private String codigo;
	private double precio;
	private int cantidad;

	@Override
	public String toString() {
		return "[nombreProducto=" + nombreProducto + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

	// SET Y GET
	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
