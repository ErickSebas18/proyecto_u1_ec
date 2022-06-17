package com.uce.edu.demo.tienda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.tienda.modelo.Vendedor;
import com.uce.edu.demo.tienda.repository.IVendedorRepository;

@Service
public class VendedorServiceImpl implements IVendedorService {

	@Autowired
	private IVendedorRepository vendedorRepository;
	
	@Autowired
	private Vendedor vendedor;
	
	@Override
	public void insertarVendedor(Vendedor v) {
		// TODO Auto-generated method stub
		System.out.println("Service Singleton: " + this.vendedor.toString());
		this.vendedorRepository.insertar(v);
	}

	@Override
	public Vendedor buscarVendedor(String nombre) {
		// TODO Auto-generated method stub
		return this.vendedorRepository.buscar(nombre);
	}

	@Override
	public void actualizarVendedor(Vendedor v) {
		// TODO Auto-generated method stub
		this.vendedorRepository.actualizar(v);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		this.vendedorRepository.eliminar(nombre);
	}

}
