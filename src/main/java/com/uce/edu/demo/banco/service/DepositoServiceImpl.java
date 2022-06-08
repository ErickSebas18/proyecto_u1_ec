package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl implements IDepositoService {

	@Autowired
	private ICuentaBancariaService cuentaBancariaService;
	
	@Autowired
	private IDepositoRepository depositoRepository;

	@Override
	public void realizarDeposito(String numeroCuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub

		CuentaBancaria cDestino = this.cuentaBancariaService.buscar(numeroCuentaDestino);
		BigDecimal saldoCuentaDestino = cDestino.getSaldo();
		BigDecimal nuevoSaldoCuentaDestino = saldoCuentaDestino.add(monto);
		cDestino.setSaldo(nuevoSaldoCuentaDestino);
		this.cuentaBancariaService.actualizar(cDestino);

		Deposito deposito = new Deposito();
		deposito.setFechaDeposito(LocalDateTime.now());
		deposito.setNumeroCuenta(numeroCuentaDestino);
		deposito.setMonto(monto);
		this.depositoRepository.insertarDeposito(deposito);
	}

}
