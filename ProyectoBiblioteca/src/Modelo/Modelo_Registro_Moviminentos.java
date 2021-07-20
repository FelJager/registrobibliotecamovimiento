package Modelo;

public class Modelo_Registro_Moviminentos {

	private int codigo_registro;
	private String codigo_material;
	private String codigo_usuario;
	private String fecha_prestamo;
	private String fecha_devolucion;
	private String estado;
	
	
	public Modelo_Registro_Moviminentos(int codigo_registro, String codigo_material, String codigo_usuario,
			String fecha_prestamo, String fecha_devolucion, String estado) {
		this.codigo_registro = codigo_registro;
		this.codigo_material = codigo_material;
		this.codigo_usuario = codigo_usuario;
		this.fecha_prestamo = fecha_prestamo;
		this.fecha_devolucion = fecha_devolucion;
		this.estado = estado;
	}
	
	
	public int getCodigo_registro() {
		return codigo_registro;
	}
	public void setCodigo_registro(int codigo_registro) {
		this.codigo_registro = codigo_registro;
	}
	public String getCodigo_material() {
		return codigo_material;
	}
	public void setCodigo_material(String codigo_material) {
		this.codigo_material = codigo_material;
	}
	public String getCodigo_usuario() {
		return codigo_usuario;
	}
	public void setCodigo_usuario(String codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}
	public String getFecha_prestamo() {
		return fecha_prestamo;
	}
	public void setFecha_prestamo(String fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}
	public String getFecha_devolucion() {
		return fecha_devolucion;
	}
	public void setFecha_devolucion(String fecha_devolucion) {
		this.fecha_devolucion = fecha_devolucion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
