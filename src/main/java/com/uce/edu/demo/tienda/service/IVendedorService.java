package com.uce.edu.demo.tienda.service;

import com.uce.edu.demo.tienda.modelo.Vendedor;

public interface IVendedorService {

	public void insertarVendedor(Vendedor v);
	
	public Vendedor buscarVendedor(String nombre);
	
	public void actualizarVendedor(Vendedor v);
	
	public void eliminar(String nombre);
	
}
