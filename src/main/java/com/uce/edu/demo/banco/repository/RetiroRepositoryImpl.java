package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository{

	@Override
	public void insertarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el retiro: " + r);
	}

	@Override
	public Retiro buscar(String numero) {
		// TODO Auto-generated method stub
		Retiro retiro = new Retiro();
		retiro.setNumeroCuenta(numero);
		return retiro;
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el retiro: " + r);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el retiro");
	}

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Retiro> listaRetiro = new ArrayList<>();
		Retiro r = new Retiro();
		r.setNumeroCuenta("4134");
		r.setSaldo(new BigDecimal(60));
		r.setFechaRetiro(LocalDateTime.of(2022, 07, 4, 2, 30));
		
		Retiro r2 = new Retiro();
		r2.setNumeroCuenta("2134");
		r2.setSaldo(new BigDecimal(10));
		r2.setFechaRetiro(LocalDateTime.of(2022, 10, 20, 1, 40));
		
		listaRetiro.add(r);
		listaRetiro.add(r2);
		
		return listaRetiro;
	}

}
