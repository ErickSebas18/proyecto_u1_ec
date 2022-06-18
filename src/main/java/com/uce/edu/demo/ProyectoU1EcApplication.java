package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1EcApplication implements CommandLineRunner {

	@Autowired
	private ProfesorGeneral profesorGeneral;

	@Autowired
	private ProfesorGeneral profesorGeneral1;

	@Autowired
	private ProfesorMateria profesorMateria;

	@Autowired
	private ProfesorMateria profesorMateria1;

	@Autowired
	private IMatriculaService matricula;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("EJEMPLO PROTOTYPE");
		this.profesorGeneral.setNombre("Erick");
		this.profesorGeneral.setApellido("Garcia");
		System.out.println(this.profesorGeneral.toString());
		System.out.println("--------------------------------");
		System.out.println(this.profesorGeneral1.toString());
		this.profesorGeneral1.setNombre("Pepe");
		System.out.println("--------------------------------");
		System.out.println(this.profesorGeneral.toString());

		System.out.println("--------------------------------");
		System.out.println(this.profesorGeneral1.toString());

		System.out.println();
		System.out.println("EJEMPLO PROTOTYPE");
		this.profesorMateria.setNombre("Daniel");
		this.profesorMateria.setApellido("Encalada");
		System.out.println(this.profesorMateria);
		System.out.println("--------------------------------");
		System.out.println(this.profesorMateria1);

		Matricula matricula1 = new Matricula();
		matricula1.setEstudiante(new Estudiante());
		matricula1.setNumero("1451");
		System.out.println("--------------------------------");
		this.matricula.insertar(matricula1);

	}

}
