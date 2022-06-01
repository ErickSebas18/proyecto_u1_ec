package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;

public interface IEstudianteRepository {
//CRUD
	// C: CREAR/INSERTAR
	public void insertar(Estudiante e);

	// R: LEER/BUSCAR
	public Estudiante buscar(String cedula);

	// U: ACTUALIZAR
	public void actualizar(Estudiante e);

	// D: ELIMINAR
	public void eliminar(String cedula);

}
