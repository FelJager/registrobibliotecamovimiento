package Modelo;

public class modelo_Usuario {
	int codigo_usuario;
	String tipo_usuario;
	String nombres;
	String apellidos;
	String carrera;
	String sucursal;
	public modelo_Usuario(int codigo_usuario, String tipo_usuario, String nombres, String apellidos, String carrera, String sucursal) {
		this.codigo_usuario = codigo_usuario;
		this.tipo_usuario = tipo_usuario;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.carrera = carrera;
		this.sucursal = sucursal;
	}
	public int getCodigo_usuario() {
		return codigo_usuario;
	}
	public void setCodigo_usuario(int codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}
	public String getTipo_usuario() {
		return tipo_usuario;
	}
	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	
	
	
	
}
