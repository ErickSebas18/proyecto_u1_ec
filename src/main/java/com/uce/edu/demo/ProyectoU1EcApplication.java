package com.uce.edu.demo;

import java.math.BigDecimal;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.ITransferenciaService;

@SpringBootApplication
public class ProyectoU1EcApplication implements CommandLineRunner {
	
	@Autowired
	private ITransferenciaService transferenciaService;
	
	@Autowired
	private IDepositoService depositoService;
	
	private String co;
	private String cd;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite cuenta de origen: ");
		co = scanner.next();
		System.out.print("Digite cuenta de destino: ");
		cd = scanner.next();
		System.out.println("\nTransferencia");
		this.transferenciaService.realizarTransferencia(co, cd, new BigDecimal(20));
		
		scanner.close();
		
		System.out.println("\nDeposito");
		this.depositoService.realizarDeposito(cd, new BigDecimal(30));
	}

}
