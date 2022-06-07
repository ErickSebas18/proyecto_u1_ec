package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {
	// CRUD
	// C: CREAR/INSERTAR
	public void insertar(Matricula e);

	// R: LEER/BUSCAR
	public Matricula buscar(String codigo);

	// U: ACTUALIZAR
	public void actualizar(Matricula e);

	// D: ELIMINAR
	public void eliminar(String codigo);
}
