package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@Override
	public void insertar(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha ingresado la matricula");
	}

	@Override
	public Matricula buscar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado la matricula: " + codigo);
		return null;
	}

	@Override
	public void actualizar(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado la matricula");
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la matricula");
	}

	

}
