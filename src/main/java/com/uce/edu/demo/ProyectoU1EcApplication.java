package com.uce.edu.demo;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;

@SpringBootApplication
public class ProyectoU1EcApplication implements CommandLineRunner {
	
	//1. DI POR ATRIBUTO
	@Autowired
	private CitaMedica cita;
	
	@Autowired
	private CitaMedica2 cita2;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto con Spring Framework");

		System.out.println(this.cita.agendar(LocalDateTime.now(), "Erick", "Zeas", 23, "Quito", "Juan", 21));
		System.out.println(this.cita2.agendar(LocalDateTime.now(), "Javier", "Terán", 32, "Quito", "Pepe", 19));
	}

}
