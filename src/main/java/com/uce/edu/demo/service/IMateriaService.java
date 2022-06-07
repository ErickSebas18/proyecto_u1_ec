package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaService {

	public void insertar(Materia m);

	public Materia buscar(String materia);

	public void actualizar(Materia m);

	public void eliminar(String materia);
}
