package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {

	public void insertar(Matricula e);

	public Matricula buscar(String codigo);

	public void actualizar(Matricula e);

	public void eliminar(String codigo);
}
