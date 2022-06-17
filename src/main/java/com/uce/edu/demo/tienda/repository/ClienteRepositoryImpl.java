package com.uce.edu.demo.tienda.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.tienda.modelo.Cliente;

@Repository
public class ClienteRepositoryImpl implements IClienteRepository {

	@Override
	public void insertar(Cliente c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado un cliente: " + c);
	}

	@Override
	public Cliente buscar(String nombre) {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
		c.setNombre(nombre);
		return c;
	}

	@Override
	public void actualizar(Cliente c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el cliente " + c);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el cliente con el nombre " + nombre);
	}

}
