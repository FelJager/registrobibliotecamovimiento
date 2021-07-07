package Modelo;

public class modelo_Usuario {
	int codigo_alumno;
	String nombres;
	String apellidos;
	String carrera;
	public modelo_Usuario(int codigo_alumno, String nombres, String apellidos, String carrera) {
		this.codigo_alumno = codigo_alumno;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.carrera = carrera;
	}
	public int getCodigo_alumno() {
		return codigo_alumno;
	}
	public void setCodigo_alumno(int codigo_alumno) {
		this.codigo_alumno = codigo_alumno;
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
	
	
	
}
