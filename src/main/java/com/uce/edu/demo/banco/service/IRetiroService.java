package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {
	
	public void insertarRetiro(String numero, BigDecimal monto);
	
	public Retiro buscarRetiro(String numero);

	public void actualizarRetiro(String numero,BigDecimal monto);

	public void eliminarRetiro(String numero);

}
