package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.IDepositoRepository;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;
import com.uce.edu.demo.banco.to.TransaccionTo;

@Service
public class TransaccionServiceImpl implements ITransaccionService {

	@Autowired
	private ITransferenciaService transferenciaService;
	
	@Autowired
	private IDepositoService depositoService;
	
	@Autowired
	private IRetiroService retiroService;
	
	@Autowired
	private ITransferenciaRepository transferenciaRepository;
	
	@Autowired
	private IDepositoRepository depositoRepository;
	
	@Autowired
	private IRetiroRepository retiroRepository;

	@Override
	public void transferencia(String cuentaOrigen, String cuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.transferenciaService.realizarTransferencia(cuentaOrigen, cuentaDestino, monto);
	}

	@Override
	public void deposito(String cuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.depositoService.realizarDeposito(cuentaDestino, monto);
	}

	@Override
	public void retiro(String cuentaOrigen, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.retiroService.insertarRetiro(cuentaOrigen, monto);
	}

	@Override
	public List<TransaccionTo> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		
		List<Transferencia> listaTransferencia = this.transferenciaRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Deposito> listaDeposito = this.depositoRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Retiro> listaRetiro = this.retiroRepository.consultar(cuenta, fechaInicio, fechaFin);
		
		//UNIR TODAS LAS LISTAS
		List<TransaccionTo> listaFinal = new ArrayList<>();
		
		for (Transferencia t: listaTransferencia) {
			TransaccionTo transaccionToTransferencia = this.transformarTransferencia(t);
			listaFinal.add(transaccionToTransferencia);
		}
		
		for (Deposito d: listaDeposito) {
			TransaccionTo transaccionToDeposito = this.transformarDeposito(d);
			listaFinal.add(transaccionToDeposito);
		}
		
		for (Retiro r: listaRetiro) {
			TransaccionTo transaccionToRetiro = this.transformarRetiro(r);
			listaFinal.add(transaccionToRetiro);
		}
		
		return listaFinal;
	}
	
	private TransaccionTo transformarTransferencia(Transferencia transferencia) {
		TransaccionTo transaccionTo = new TransaccionTo();
		transaccionTo.setFecha(transferencia.getFechaTransferencia());
		transaccionTo.setMonto(transferencia.getMontoTransferir());
		transaccionTo.setTipo("T");
		return transaccionTo;
	}
	
	private TransaccionTo transformarDeposito(Deposito deposito) {
		TransaccionTo transaccionTo = new TransaccionTo();
		transaccionTo.setFecha(deposito.getFechaDeposito());
		transaccionTo.setMonto(deposito.getMonto());
		transaccionTo.setTipo("D");
		return transaccionTo;
	}

	private TransaccionTo transformarRetiro(Retiro retiro) {
		TransaccionTo transaccionTo = new TransaccionTo();
		transaccionTo.setFecha(retiro.getFechaRetiro());
		transaccionTo.setMonto(retiro.getSaldo());
		transaccionTo.setTipo("R");
		return transaccionTo;
	}
}
