package com.uce.edu.demo.inventario.repository;

import com.uce.edu.demo.inventario.modelo.Producto;

public interface IProductoRepository {

	public void insertarProducto(Producto p);
	
	public Producto buscar(String codigo);
	
	public void actualizarProducto(Producto p);
	
	public void eliminarProducto(String codigo);
	
}
