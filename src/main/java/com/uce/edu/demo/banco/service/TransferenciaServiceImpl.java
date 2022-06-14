package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	//Como la lógica de ICuentaBancariaService no hace nada.
	//Si puedo inyectar el ICuentaBancariaRepository 
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService cuentaBancariaService;
	
	@Autowired
	private ITransferenciaRepository transferenciaRepository;
	
	@Override
	public void realizarTransferencia(String cuentaOrigen, String cuentaDestingo, BigDecimal monto) {
		// TODO Auto-generated method stub

		CuentaBancaria cOrigen = this.cuentaBancariaService.buscarCuentaBancaria(cuentaOrigen);
		BigDecimal saldoOrigen= cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.cuentaBancariaService.actualizarCuentaBancaria(cOrigen);
		
		CuentaBancaria cDestino = this.cuentaBancariaService.buscarCuentaBancaria(cuentaDestingo);
		BigDecimal saldoDestino = cDestino.getSaldo();
		BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
		cDestino.setSaldo(nuevoSaldoDestino);
		this.cuentaBancariaService.actualizarCuentaBancaria(cDestino);
		
		Transferencia t = new Transferencia();
		t.setNumeroCuentaOrigen(cuentaOrigen);
		t.setNumeroCuentaDestino(cuentaDestingo);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());
		this.transferenciaRepository.insertar(t);
	}

	@Override
	public Transferencia buscarTransferencia(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.buscar(numeroCuentaDestino);
	}

	@Override
	public void actualizarTransferencia(Transferencia f) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.actualizar(f);
	}

	@Override
	public void eliminarTransferencia(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.eliminar(numeroCuentaDestino);
	}

	
}
