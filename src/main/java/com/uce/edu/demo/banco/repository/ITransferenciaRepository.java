package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	public void insertar(Transferencia t);

	public Transferencia buscar(String numeroCuentaDestino);

	public void actualizar(Transferencia f);

	public void eliminar(String numeroCuentaDestino);
}
