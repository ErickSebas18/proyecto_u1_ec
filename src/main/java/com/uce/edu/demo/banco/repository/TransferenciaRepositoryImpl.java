package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aquí se inserta la transferencia en la base de datos " + t);
	}

	@Override
	public Transferencia buscar(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		Transferencia t = new Transferencia();
		t.setMontoTransferir(new BigDecimal(200));
		return t;
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado la transferencia " + t);
	}

	@Override
	public void eliminar(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la transferencia ");
	}

}
