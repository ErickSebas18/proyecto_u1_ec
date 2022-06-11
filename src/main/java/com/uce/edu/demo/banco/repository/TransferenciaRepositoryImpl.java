package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Transferencia> listaConsultada = new ArrayList<>();
		Transferencia t = new Transferencia();
		t.setNumeroCuentaDestino("1452");
		t.setNumeroCuentaOrigen("5124");
		t.setMontoTransferir(new BigDecimal(100));
		t.setFechaTransferencia(LocalDateTime.now());
		listaConsultada.add(t);
		
		Transferencia t2 = new Transferencia();
		t2.setNumeroCuentaDestino("4123");
		t2.setNumeroCuentaOrigen("6241");
		t2.setMontoTransferir(new BigDecimal(200));
		t2.setFechaTransferencia(LocalDateTime.now());
		listaConsultada.add(t2);
		
		return listaConsultada;
	}

}
