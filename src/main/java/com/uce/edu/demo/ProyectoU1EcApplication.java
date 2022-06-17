package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.tienda.modelo.Cliente;
import com.uce.edu.demo.tienda.modelo.Vendedor;
import com.uce.edu.demo.tienda.service.IClienteService;
import com.uce.edu.demo.tienda.service.IVendedorService;

@SpringBootApplication
public class ProyectoU1EcApplication implements CommandLineRunner {

	@Autowired
	private Cliente cliente;
	
	@Autowired
	private Cliente cliente2;
	
	@Autowired
	private Cliente cliente3;
	
	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private Vendedor vendedor;
	
	@Autowired
	private Vendedor vendedor2;
	
	@Autowired
	private IVendedorService vendedorService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	System.out.println("-------------------------");
	System.out.println("EJEMPLO PROTOYPE");
	System.out.println("-------------------------");
	this.cliente.setNombre("Erick");
	this.cliente.setApellido("Chávez");
	this.cliente.setNumeroCedula("145131546");
	this.cliente.setNumeroCelular("098432146");
	this.clienteService.insertarCliente(cliente);
	System.out.println();
	this.cliente2.setNombre("Andres");
	this.cliente2.setApellido("García");
	this.cliente2.setNumeroCedula("613451234");
	this.cliente2.setNumeroCelular("0916423457");
	this.clienteService.insertarCliente(cliente2);
	System.out.println();
	this.clienteService.insertarCliente(cliente3);
	
	System.out.println("-------------------------");
	System.out.println("EJEMPLO SINGLETON");
	System.out.println("-------------------------");
	this.vendedor.setNombre("Carlos");
	this.vendedor.setApellido("Carrera");
	this.vendedorService.insertarVendedor(vendedor);
	System.out.println();
	this.vendedor2.setNombre("Ana");
	this.vendedorService.insertarVendedor(vendedor2);
	
	}

}
