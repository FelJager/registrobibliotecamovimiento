package Modelo;

import java.util.Date;

public class modelo_RegistroMovimientos {
	private int codigo_material;
	private int codigo_usuario;
	private Date fecha_prestamo;
	
	public modelo_RegistroMovimientos(int codigo_material, int codigo_usuario, Date fecha_prestamo) {
		this.codigo_material = codigo_material;
		this.codigo_usuario = codigo_usuario;
		this.fecha_prestamo = fecha_prestamo;
	}
	public int getCodigo_material() {
		return codigo_material;
	}
	public void setCodigo_material(int codigo_material) {
		this.codigo_material = codigo_material;
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

