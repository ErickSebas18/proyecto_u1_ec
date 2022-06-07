package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository {

	@Override
	public void insertar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado materia");
	}

	@Override
	public Materia buscar(String materia) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado materia: " + materia);
		return null;
	}

	@Override
	public void actualizar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado la materia");

	}

	@Override
	public void eliminar(String materia) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la materia: " + materia);
	}

}
