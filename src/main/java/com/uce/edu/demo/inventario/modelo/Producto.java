package com.uce.edu.demo.inventario.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto {

	private String nombreProducto;
	private String codigoProducto;
	private BigDecimal precioCompra;
	private BigDecimal precioVenta;
	private LocalDateTime fechaIngreso;
	private String cantidad;

	// SET Y GET
	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	
	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [nombreProducto=" + nombreProducto + ", codigoProducto=" + codigoProducto + ", precioCompra="
				+ precioCompra + ", fechaIngreso=" + fechaIngreso + ", cantidad="
				+ cantidad + "]";
	}

}
