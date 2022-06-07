package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1EcApplication implements CommandLineRunner {

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
		
		Estudiante e1 = new Estudiante();
		e1.setNombre("Raul");
		e1.setApellido("Correa");
		e1.setCedula("1724142782");
		this.estudianteService.ingresarEstudiante(e1);
		
		//USAR LOS 3 MÉTODOS RESTANTES
		e1.setCedula("1241314315");
		this.estudianteService.actualizarEstudiante(e1);
		
		this.estudianteService.buscarPorApellido("Chávez");
		this.estudianteService.borrarEstudiante("1726142314");
	}

}
