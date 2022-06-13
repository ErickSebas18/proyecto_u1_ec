package com.uce.edu.demo.inventario.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.inventario.modelo.Producto;

public interface IGestorInventarioService {

	public List<Producto> consultar(LocalDateTime fecha);	
}
