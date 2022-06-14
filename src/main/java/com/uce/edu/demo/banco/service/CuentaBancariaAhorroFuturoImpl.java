package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("ahorroFuturo")
public class CuentaBancariaAhorroFuturoImpl implements ICuentaBancariaService{

	@Override
	public void insertarCuentaBancaria(String numero, BigDecimal monto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscarCuentaBancaria(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarCuentaBancaria(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarCuentaBancaria(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularInteres(String numero, BigDecimal saldo) {
		// TODO Auto-generated method stub
		BigDecimal interes = new BigDecimal(30).add(saldo).multiply(new BigDecimal(2));
		return interes;
	}

}
