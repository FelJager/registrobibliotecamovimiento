package Modelo;

import java.util.Date;

public class modelo_RegistroMovimientos {
	int codigo_libro;
	int codigo_usuario;
	Date fecha_prestamo;
	
	
	public modelo_RegistroMovimientos(int codigo_libro, int codigo_usuario, Date fecha_prestamo) {
		this.codigo_libro = codigo_libro;
		this.codigo_usuario = codigo_usuario;
		this.fecha_prestamo = fecha_prestamo;
	}


	public int getCodigo_libro() {
		return codigo_libro;
	}


	public void setCodigo_libro(int codigo_libro) {
		this.codigo_libro = codigo_libro;
	}


	public int getCodigo_usuario() {
		return codigo_usuario;
	}


	public void setCodigo_usuario(int codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}


	public Date getFecha_prestamo() {
		return fecha_prestamo;
	}


	public void setFecha_prestamo(Date fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}
	
		
	
}

