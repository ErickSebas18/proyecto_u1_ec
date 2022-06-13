package com.uce.edu.demo.inventario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.inventario.modelo.Inventario;
import com.uce.edu.demo.inventario.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService{

	@Autowired
	private IInventarioRepository iInventarioRepository;
		
	@Override
	public void insertarInventario(Inventario i) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.insertar(i);
	}

	@Override
	public Inventario buscarInventario() {
		return this.iInventarioRepository.buscar();
	}

	@Override
	public void actualizarInventario(Inventario i) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.actualizar(i);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.eliminar(nombre);
	}

}
