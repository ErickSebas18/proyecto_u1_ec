package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class FachadaCuentaBancariaServiceImpl implements IFachadaCuentaBancaria {

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;

	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService bancariaServiceCorriente;

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaServiceAhorro;

	@Override
	public BigDecimal calcularInteres(String numero) {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta = this.bancariaRepository.buscar(numero);
		BigDecimal interes = null;
		if (cuenta.getTipo().equals("A")) {
			// Ahorros
			interes = this.bancariaServiceAhorro.calcularInteres(numero, cuenta.getSaldo());
		} else {
			// Corriente
			interes = this.bancariaServiceCorriente.calcularInteres(numero, cuenta.getSaldo());
		}
		return interes;
	}

}
