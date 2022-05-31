package com.uce.edu.demo;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.Prestamo;
import com.uce.edu.demo.concesionaria.CompraAuto;
import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.tienda.Tienda;

@SpringBootApplication
public class ProyectoU1EcApplication implements CommandLineRunner {

	// 1. DI POR ATRIBUTO
//	@Autowired
//	private CitaMedica cita;
//	
//	@Autowired
//	private CitaMedica2 cita2;

	@Autowired
	private CompraAuto compra;

	@Autowired
	private Tienda tienda;

	@Autowired
	private Prestamo prestamo;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("Mi primer proyecto con Spring Framework");
//
//		System.out.println(this.cita.agendar(LocalDateTime.now(), "Erick", "Zeas", 23, "Quito", "Juan", 21));
//		System.out.println(this.cita2.agendar(LocalDateTime.now(), "Javier", "Terán", 32, "Quito", "Pepe", 19));

		System.out.println("\n1. Inyección de Dependencia por Atributos: ");
		System.out.println(
				this.compra.comprar("Erick", "Fernandez", 146157, "Cupra", 2022, 450.000, LocalDateTime.now()));

		double total = tienda.pagar("Erick", "154613241", "Quitumbe", "PlayStation 5", "451", 1500.80, 2);
		System.out.println("\n2. Inyección de Dependencias por Constructor: ");
		System.out.println(tienda.toString());
		System.out.println("El total es: $" + total);

		System.out.println("\n3. Inyección de Dependencias por Métodos Set");
		System.out.println(this.prestamo.prestar("Saúl", "Dávalos", "Leonardo", 5, LocalDateTime.now(), 25000));

	}

}
