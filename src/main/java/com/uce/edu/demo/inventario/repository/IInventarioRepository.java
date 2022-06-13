package com.uce.edu.demo.inventario.repository;

import com.uce.edu.demo.inventario.modelo.Inventario;

public interface IInventarioRepository {

	public void insertar(Inventario i);
	
	public Inventario buscar();
	
	public void actualizar(Inventario i);
	
	public void eliminar(String nombre);
	
}
