package com.uce.edu.demo.tienda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.tienda.modelo.Cliente;
import com.uce.edu.demo.tienda.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepository clienteRepository;
	
	@Autowired
	private Cliente cliente;
	
	@Override
	public void insertarCliente(Cliente c) {
		// TODO Auto-generated method stub
		System.out.println("Service Prototype: " + this.cliente.toString());
		this.clienteRepository.insertar(c);
	}

	@Override
	public Cliente buscarCliente(String nombre) {
		// TODO Auto-generated method stub
		return this.clienteRepository.buscar(nombre);
	}

	@Override
	public void actualizarCliente(Cliente c) {
		// TODO Auto-generated method stub
		this.clienteRepository.actualizar(c);
	}

	@Override
	public void eliminarCliente(String nombre) {
		// TODO Auto-generated method stub
		this.clienteRepository.eliminar(nombre);
	}

}
