package com.uce.edu.demo.inventario.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.inventario.modelo.Producto;

public interface IProductoService {

	public void insertarProducto(String nombre, String codigo, BigDecimal precioCompra, String cantidad, LocalDateTime fecha );
	
	public Producto buscarProducto(String codigo);
	
	public void actualizarProducto(Producto p);
	
	public void eliminarProducto(String codigo);
	
}
