package com.uce.edu.demo.inventario.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.inventario.modelo.Producto;
import com.uce.edu.demo.inventario.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepository iProductoRepository;
	
	@Override
	public void insertarProducto(String nombre, String codigo, BigDecimal precioCompra, String cantidad, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		Producto p = new Producto();
		p.setNombreProducto(nombre);
		p.setCodigoProducto(codigo);
		p.setPrecioCompra(precioCompra);
		p.setCantidad(cantidad);
		p.setFechaIngreso(fecha);
		this.iProductoRepository.insertarProducto(p);
	}

	@Override
	public Producto buscarProducto(String codigo) {
		// TODO Auto-generated method stub
		Producto p = new Producto();
		p.setCodigoProducto(codigo);
		return p;
	}

	@Override
	public void actualizarProducto(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.actualizarProducto(p);
	}

	@Override
	public void eliminarProducto(String codigo) {
		// TODO Auto-generated method stub
		this.iProductoRepository.eliminarProducto(codigo);
	}

}
