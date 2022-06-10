package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService{

	@Autowired
	private ICuentaBancariaService cuentaBancaria;
	
	@Autowired
	private IRetiroRepository retiroRepository;
	
	@Override
	public void insertarRetiro(String numero, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta = this.cuentaBancaria.buscarCuentaBancaria(numero);
		BigDecimal saldoOrigen = cuenta.getSaldo();
		BigDecimal retiro = saldoOrigen.subtract(monto);
		cuenta.setSaldo(retiro);
		this.cuentaBancaria.actualizarCuentaBancaria(cuenta);
		
		Retiro r = new Retiro();
		r.setNumeroCuenta(numero);
		r.setSaldo(monto);
		r.setFechaRetiro(LocalDateTime.now());
		this.retiroRepository.insertarRetiro(r);
		
	}

	@Override
	public Retiro buscarRetiro(String numero) {
		// TODO Auto-generated method stub
		return this.retiroRepository.buscar(numero);
	}

	@Override
	public void actualizarRetiro(String numero, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta = this.cuentaBancaria.buscarCuentaBancaria(numero);
		BigDecimal saldoOrigen = cuenta.getSaldo();
		BigDecimal retiro = saldoOrigen.subtract(monto);
		cuenta.setSaldo(retiro);
		
		Retiro r = new Retiro();
		r.setSaldo(retiro);
		this.retiroRepository.actualizar(r);
	}

	@Override
	public void eliminarRetiro(String numero) {
		// TODO Auto-generated method stub
		this.retiroRepository.eliminar(numero);
	}

}
