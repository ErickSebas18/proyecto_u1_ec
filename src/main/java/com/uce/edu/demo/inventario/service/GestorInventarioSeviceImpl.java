package com.uce.edu.demo.inventario.service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.inventario.modelo.Producto;
import com.uce.edu.demo.inventario.repository.IInventarioRepository;

@Service
public class GestorInventarioSeviceImpl implements IGestorInventarioService {

	@Autowired
	private IInventarioRepository iInventarioRepository;

	@Override
	public List<Producto> consultar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		List<Producto> listaInventario = this.iInventarioRepository.buscar().getListaProductos();

		List<Producto> listafinal = new ArrayList<>();

		for (Producto e : listaInventario) {
			if (e.getFechaIngreso().isAfter(fecha)) {
				e.setPrecioVenta(this.calcularPrecio(e.getPrecioCompra()));
				DecimalFormat df = new DecimalFormat("###.##");
				listafinal.add(e);
				System.out.println(e.getNombreProducto() + " - " + e.getCantidad() + " unidades - " + "$"+ df.format(e.getPrecioVenta()) + " - "
						+ e.getFechaIngreso());
			}
		}
		return listafinal;
	}

	private BigDecimal calcularPrecio(BigDecimal precioCompra) {
		BigDecimal ganancia = precioCompra.multiply(new BigDecimal(0.1));
		BigDecimal iva = precioCompra.multiply(new BigDecimal(0.12));
		BigDecimal precioVenta = precioCompra.add(iva).add(ganancia);
		return precioVenta;
	}

}
