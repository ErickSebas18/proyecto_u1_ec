package com.uce.edu.demo.inventario.service;

import com.uce.edu.demo.inventario.modelo.Inventario;

public interface IInventarioService {

	public void insertarInventario(Inventario i);
	
	public Inventario buscarInventario();
	
	public void actualizarInventario(Inventario i);
	
	public void eliminar(String nombre);
}
