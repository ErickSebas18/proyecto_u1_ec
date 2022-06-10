package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {

	public void insertarRetiro(Retiro r);

	public Retiro buscar(String numero);

	public void actualizar(Retiro r);

	public void eliminar(String numero);
	
}
