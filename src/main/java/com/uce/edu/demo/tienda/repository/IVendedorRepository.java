package com.uce.edu.demo.tienda.repository;

import com.uce.edu.demo.tienda.modelo.Vendedor;

public interface IVendedorRepository {

	public void insertar(Vendedor v);

	public Vendedor buscar(String nombre);

	public void actualizar(Vendedor v);

	public void eliminar(String nombre);

}
