package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaRepository {
	// CRUD
	// C: CREAR/INSERTAR
	public void insertar(Materia m);

	// R: LEER/BUSCAR
	public Materia buscar(String materia);

	// U: ACTUALIZAR
	public void actualizar(Materia m);

	// D: ELIMINAR
	public void eliminar(String materia);
}
