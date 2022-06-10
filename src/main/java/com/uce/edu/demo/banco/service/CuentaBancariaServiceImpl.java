package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepository cuentaBancariaRepository;
	
	@Override
	public void insertarCuentaBancaria(String numero, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.setNumero(numero);
		cuenta.setSaldo(monto);
		this.cuentaBancariaRepository.insertarCuentaBancaria(cuenta);
	}
	
	@Override
	public CuentaBancaria buscarCuentaBancaria(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepository.buscar(numero);
	}

	@Override
	public void actualizarCuentaBancaria(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepository.actualizar(c);
	}
	
	@Override
	public void eliminarCuentaBancaria(String numero) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepository.eliminar(numero);
	}

}
