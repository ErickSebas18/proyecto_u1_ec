package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.inventario.service.IGestorInventarioService;
import com.uce.edu.demo.inventario.service.IProductoService;

@SpringBootApplication
public class ProyectoU1EcApplication implements CommandLineRunner {

	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private IGestorInventarioService gestorInventarioService;
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println();
		this.productoService.insertarProducto("Carne", "31341", new BigDecimal(5.75), "15", LocalDateTime.of(2021, 12, 5, 4, 45));
		this.productoService.insertarProducto("Huevos", "9146", new BigDecimal(3.76), "54", LocalDateTime.of(2020, 06, 04, 22, 45));
		this.productoService.insertarProducto("Leche", "1652", new BigDecimal(0.85), "45", LocalDateTime.of(2022, 12, 5, 22, 45));
		this.productoService.insertarProducto("Pan", "6521", new BigDecimal(0.17), "51", LocalDateTime.of(2021, 04, 14, 14, 45));
		this.productoService.insertarProducto("Papas", "2134", new BigDecimal(2.50), "74", LocalDateTime.of(2021, 04, 14, 14, 45));
		
		System.out.println("-----------------------------------");
		
		this.gestorInventarioService.consultar(LocalDateTime.of(2020, 8, 4, 00, 00));
	}

}
