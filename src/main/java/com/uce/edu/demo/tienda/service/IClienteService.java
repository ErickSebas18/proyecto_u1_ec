package com.uce.edu.demo.tienda.service;

import com.uce.edu.demo.tienda.modelo.Cliente;

public interface IClienteService {

	public void insertarCliente(Cliente c);

	public Cliente buscarCliente(String nombre);

	public void actualizarCliente(Cliente c);

	public void eliminarCliente(String nombre);

}
