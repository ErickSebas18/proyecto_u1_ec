package com.uce.edu.demo.inventario.repository;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.inventario.modelo.Inventario;
import com.uce.edu.demo.inventario.modelo.Producto;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{

	@Override
	public void insertar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha ingresado el inventario: " + i);
	}

	@Override
	public Inventario buscar() {
		// TODO Auto-generated method stub
		Producto producto1 = new Producto();
		producto1.setNombreProducto("Carne");
		producto1.setCodigoProducto("31341");
		producto1.setPrecioCompra(new BigDecimal(0.75));
		producto1.setCantidad("15");
		producto1.setFechaIngreso(LocalDateTime.of(2021, 04, 14, 14, 45));
		
		Producto producto2 = new Producto();
		producto2.setNombreProducto("Huevos");
		producto2.setCodigoProducto("9146");
		producto2.setPrecioCompra(new BigDecimal(3.76));
		producto2.setCantidad("54");
		producto2.setFechaIngreso(LocalDateTime.of(2020, 06, 04, 22, 45));
		
		Producto producto3 = new Producto();
		producto3.setNombreProducto("Leche");
		producto3.setCodigoProducto("1652");
		producto3.setPrecioCompra(new BigDecimal(0.85));
		producto3.setCantidad("45");
		producto3.setFechaIngreso(LocalDateTime.of(2022, 12, 5, 22, 45));
	
		Producto producto4 = new Producto();
		producto4.setNombreProducto("Pan");
		producto4.setCodigoProducto("6521");
		producto4.setPrecioCompra(new BigDecimal(0.17));
		producto4.setCantidad("51");
		producto4.setFechaIngreso(LocalDateTime.of(2021, 04, 14, 14, 45));
		
		Producto producto5 = new Producto();
		producto5.setNombreProducto("Papas");
		producto5.setCodigoProducto("2134");
		producto5.setPrecioCompra(new BigDecimal(2.50));
		producto5.setCantidad("74");
		producto5.setFechaIngreso(LocalDateTime.of(2021, 04, 14, 14, 45));
		
		List<Producto> listaProductos = new ArrayList<Producto>();
		listaProductos.add(producto1);
		listaProductos.add(producto2);
		listaProductos.add(producto3);
		listaProductos.add(producto4);
		listaProductos.add(producto5);
		
		Inventario i = new Inventario();
		i.setListaProductos(listaProductos);
		//System.out.println(i);
		return i;
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el inventario: " + i);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el inventario: " + nombre);
	}

}
