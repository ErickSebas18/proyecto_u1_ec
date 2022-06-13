package com.uce.edu.demo.inventario.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.inventario.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	@Override
	public void insertarProducto(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado un producto: " + p);
	}

	@Override
	public Producto buscar(String codigo) {
		// TODO Auto-generated method stub
		Producto p = new Producto();
		p.setCodigoProducto("52134");
		return p;
	}

	@Override
	public void actualizarProducto(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el producto: " + p);
	}

	@Override
	public void eliminarProducto(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el producto con el código: " + codigo);
	}

}
