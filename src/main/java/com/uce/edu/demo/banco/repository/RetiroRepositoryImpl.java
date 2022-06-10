package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository{

	@Override
	public void insertarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el retiro: " + r);
	}

	@Override
	public Retiro buscar(String numero) {
		// TODO Auto-generated method stub
		Retiro retiro = new Retiro();
		retiro.setNumeroCuenta(numero);
		return retiro;
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el retiro: " + r);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el retiro");
	}

}
