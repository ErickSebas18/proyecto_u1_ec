package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	
	public void insertarCuentaBancaria(String numero, BigDecimal monto);
	
	public CuentaBancaria buscarCuentaBancaria(String numero);
	
	public void actualizarCuentaBancaria(CuentaBancaria c);
	
	public void eliminarCuentaBancaria(String numero);
	
	public BigDecimal calcularInteres(String numero, BigDecimal saldo);
}
