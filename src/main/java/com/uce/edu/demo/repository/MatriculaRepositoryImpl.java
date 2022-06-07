package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha ingresado la matricula " + matricula);
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado la matricula: " + numero);
		Matricula matricula = new Matricula();
		matricula.setNumero("1");
		return matricula;
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado la matricula " + matricula);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la matricula " + numero);
	}

}
