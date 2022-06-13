package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matriculaRepository;

	@Override
	public void insertar(Matricula m) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(m);
	}

	@Override
	public Matricula buscar(String codigo) {
		// TODO Auto-generated method stub
		this.matriculaRepository.buscar(codigo);
		return null;
	}

	@Override
	public void actualizar(Matricula m) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(m);
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(codigo);
	}



}
