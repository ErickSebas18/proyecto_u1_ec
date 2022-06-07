package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {
	// CRUD
	// C: CREAR/INSERTAR
	public void insertar(Matricula matricula);

	// R: LEER/BUSCAR
	public Matricula buscar(String numero);

	// U: ACTUALIZAR
	public void actualizar(Matricula matricula);

	// D: ELIMINAR
	public void eliminar(String numero);
}
