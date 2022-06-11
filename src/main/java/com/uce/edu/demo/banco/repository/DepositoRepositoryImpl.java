package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository{

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el depósito: " + d);
	}

	@Override
	public Deposito buscar(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		Deposito d = new Deposito();
		d.setMonto(new BigDecimal(100));
		return d;
	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el deposito " + d);
	}

	@Override
	public void eliminar(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado deposito de la cuenta: " + numeroCuentaDestino);
	}

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Deposito> listaDeposito = new ArrayList<>();
		Deposito d = new Deposito();
		d.setNumeroCuenta("41213");
		d.setMonto(new BigDecimal(40));
		d.setFechaDeposito(LocalDateTime.of(2021, 05, 10, 8, 50));
		
		Deposito d2 = new Deposito();
		d2.setNumeroCuenta("2134");
		d2.setMonto(new BigDecimal(20));
		d2.setFechaDeposito(LocalDateTime.of(2021, 01, 10, 8, 50));
		
		listaDeposito.add(d);
		listaDeposito.add(d2);
		return listaDeposito;
	}

}
