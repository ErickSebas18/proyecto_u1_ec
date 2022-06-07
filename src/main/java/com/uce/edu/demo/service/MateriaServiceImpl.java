package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.repository.IEstudianteRepository;
import com.uce.edu.demo.repository.IMateriaRepository;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	private IMateriaRepository materiaRepository;

	@Override
	public void insertar(Materia m) {
		// TODO Auto-generated method stub
		this.materiaRepository.insertar(m);
	}

	@Override
	public Materia buscar(String materia) {
		// TODO Auto-generated method stub
		return this.materiaRepository.buscar(materia);
	}

	@Override
	public void actualizar(Materia m) {
		// TODO Auto-generated method stub
		this.materiaRepository.actualizar(m);

	}

	@Override
	public void eliminar(String materia) {
		// TODO Auto-generated method stub
		this.materiaRepository.eliminar(materia);
	}

}
