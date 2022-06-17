package com.uce.edu.demo.tienda.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.tienda.modelo.Vendedor;

@Repository
public class VendedorRepositoryImpl implements IVendedorRepository {

	@Override
	public void insertar(Vendedor v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado un Vendedor: " + v);
	}

	@Override
	public Vendedor buscar(String nombre) {
		// TODO Auto-generated method stub
		Vendedor v = new Vendedor();
		v.setNombre(nombre);
		return v;
	}

	@Override
	public void actualizar(Vendedor v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el vendedor: " + v);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el vendedor con el nombre: " + nombre);
	}

}
