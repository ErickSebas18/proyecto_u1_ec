package com.uce.edu.demo;

import java.math.BigDecimal;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;

@SpringBootApplication
public class ProyectoU1EcApplication implements CommandLineRunner {

	@Autowired
	private ITransferenciaService transferenciaService;

	@Autowired
	private IDepositoService depositoService;

	@Autowired
	private IRetiroService retiroService;

	private String cuentaOrigen;
	private String cuentaDestino;
	private int monto;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite cuenta de origen: ");
		cuentaOrigen = scanner.next();
		System.out.print("Digite cuenta de destino: ");
		cuentaDestino = scanner.next();
		System.out.println("Digite monto: ");
		monto = scanner.nextInt();
		System.out.println("\nTransferencia");
		this.transferenciaService.realizarTransferencia(cuentaOrigen, cuentaDestino, new BigDecimal(monto));
		this.transferenciaService.buscarTransferencia(cuentaDestino);

		System.out.println("\nDeposito");
		System.out.print("Digite cuenta de destino: ");
		cuentaDestino = scanner.next();
		System.out.println("Digite monto: ");
		monto = scanner.nextInt();
		this.depositoService.realizarDeposito(cuentaDestino, new BigDecimal(monto));

		System.out.print("Digite cuenta de origen: ");
		cuentaOrigen = scanner.next();
		System.out.println("Digite monto: ");
		monto = scanner.nextInt();
		this.retiroService.insertarRetiro(cuentaOrigen, new BigDecimal(monto));
		this.retiroService.buscarRetiro(cuentaOrigen);
		System.out.println("Digite monto ha actualizar: ");
		monto = scanner.nextInt();
		this.retiroService.actualizarRetiro(cuentaOrigen, new BigDecimal(monto));
		this.retiroService.eliminarRetiro(cuentaOrigen);

		scanner.close();

	}

}
