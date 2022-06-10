package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {

	public void realizarTransferencia(String cuentaOrigen, String cuentaDestingo, BigDecimal monto);
	
	public Transferencia buscarTransferencia(String numeroCuentaDestino);

	public void actualizarTransferencia(Transferencia f);

	public void eliminarTransferencia(String numeroCuentaDestino);
}
