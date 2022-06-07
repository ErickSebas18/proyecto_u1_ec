package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1EcApplication implements CommandLineRunner {
	
	@Autowired
	private IMateriaService materiaService;
	
	@Autowired
	private IMatriculaService matriculaService;
	
	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estudiante e = new Estudiante();
		e.setNombre("Erick");
		e.setApellido("Chávez");
		e.setCedula("1726142314");
		this.estudianteService.ingresarEstudiante(e);
		
		
		Materia m = new Materia();
		m.setNombre("Programación Avanzada II");
		m.setSemestre("Sexto");
		this.materiaService.insertar(m);
		this.materiaService.buscar(m.getNombre());
		m.setSemestre("Quinto");
		this.materiaService.actualizar(m);
		this.materiaService.eliminar("Análisis");
		
		Materia m2 = new Materia();
		m2.setNombre("Análisis");
		m2.setSemestre("Séptimo");
		
		List<Materia> l = new ArrayList<Materia>();
		l.add(m);
		l.add(m2);
		
		
		Matricula matricula = new Matricula();
		matricula.setEstudiante(e);
		matricula.setMateria(l);
		matricula.setNumero("124240");
		
		this.matriculaService.insertar(matricula);
		this.matriculaService.buscar(matricula.getNumero());
		matricula.setNumero("1324");
		this.matriculaService.actualizar(matricula);
		this.matriculaService.eliminar(matricula.getNumero());
	}

}
