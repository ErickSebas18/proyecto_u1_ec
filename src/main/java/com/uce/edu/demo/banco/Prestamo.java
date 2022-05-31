package com.uce.edu.demo.banco;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Prestamo {

	//3. DI POR SET
	private Usuario usuario;
	private Ventanilla ventanilla;

	public String prestar(String usuario, String contrasenia, String nombreAsesor, int numVentanilla,
			LocalDateTime fechaPrestamo, int cantidad) {
		
		this.usuario.setUsuario(usuario);
		this.usuario.setContrasenia(contrasenia);
		
		this.ventanilla.setNombreAsesor(nombreAsesor);
		this.ventanilla.setNumVentanilla(numVentanilla);
		this.ventanilla.setFechaPrestamo(fechaPrestamo);
		this.ventanilla.setCantidad(cantidad);

		return "Prestamo realizado a: " + this.usuario.getUsuario() + " la cantidad de: $" + this.ventanilla.getCantidad() ;
		
	}

	// SET Y GET
	public Usuario getUsuario() {
		return usuario;
	}

	@Autowired
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Ventanilla getVentanilla() {
		return ventanilla;
	}

	@Autowired
	public void setVentanilla(Ventanilla ventanilla) {
		this.ventanilla = ventanilla;
	}

}
