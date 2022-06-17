package com.uce.edu.demo.tienda.repository;

import com.uce.edu.demo.tienda.modelo.Cliente;

public interface IClienteRepository {

	public void insertar(Cliente c);
	
	public Cliente buscar(String nombre);
	
	public void actualizar(Cliente c);
	
	public void eliminar(String nombre);
	
}
