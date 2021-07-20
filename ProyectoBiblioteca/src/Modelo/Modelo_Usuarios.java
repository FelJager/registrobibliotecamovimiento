package Modelo;

public class Modelo_Usuarios {

	private String codigo_usuario;
	private String tipo_usuario;
	private String nombres_usuario;
	private String apellidos_usuario;
	private String carrera_usuario;
	private String sucursal_usuario;
	
	
	public Modelo_Usuarios(String codigo_usuario, String tipo_usuario, String nombres_usuario, String apellidos_usuario,
			String carrera_usuario, String sucursal_usuario) {
		this.codigo_usuario = codigo_usuario;
		this.tipo_usuario = tipo_usuario;
		this.nombres_usuario = nombres_usuario;
		this.apellidos_usuario = apellidos_usuario;
		this.carrera_usuario = carrera_usuario;
		this.sucursal_usuario = sucursal_usuario;
	}


	public String getCodigo_usuario() {
		return codigo_usuario;
	}


	public void setCodigo_usuario(String codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}


	public String getTipo_usuario() {
		return tipo_usuario;
	}


	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}


	public String getNombres_usuario() {
		return nombres_usuario;
	}


	public void setNombres_usuario(String nombres_usuario) {
		this.nombres_usuario = nombres_usuario;
	}


	public String getApellidos_usuario() {
		return apellidos_usuario;
	}


	public void setApellidos_usuario(String apellidos_usuario) {
		this.apellidos_usuario = apellidos_usuario;
	}


	public String getCarrera_usuario() {
		return carrera_usuario;
	}


	public void setCarrera_usuario(String carrera_usuario) {
		this.carrera_usuario = carrera_usuario;
	}


	public String getSucursal_usuario() {
		return sucursal_usuario;
	}


	public void setSucursal_usuario(String sucursal_usuario) {
		this.sucursal_usuario = sucursal_usuario;
	}
	
}
