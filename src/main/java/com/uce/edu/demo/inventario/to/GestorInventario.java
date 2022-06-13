package com.uce.edu.demo.inventario.to;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GestorInventario {

	private String nombreProducto;
	private String cantidad;
	private BigDecimal precioVenta;
	private LocalDateTime fecha;

	//SET Y GET
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	
}
