package Modelo;

import java.util.Date;

public class modelo_Material {
	
	private int codigo_material;
	private String titulo;
	private String [] autores;
	private String tipo_recurso;
	private String editorial;
	private Date fecha_publicacion;
	private int numero_paginas;
	private String detalle_publicacion;
	private String imagen;
	private String[] biblioteca;
	public modelo_Material(int codigo_material, String titulo, String[] autores, String tipo_recurso, String editorial, Date fecha_publicacion, int numero_paginas, String detalle_publicacion, String imagen, String[] biblioteca) {
		this.codigo_material = codigo_material;
		this.titulo = titulo;
		this.autores = autores;
		this.tipo_recurso = tipo_recurso;
		this.editorial = editorial;
		this.fecha_publicacion = fecha_publicacion;
		this.numero_paginas = numero_paginas;
		this.detalle_publicacion = detalle_publicacion;
		this.imagen = imagen;
		this.biblioteca = biblioteca;
	}
	public int getCodigo_material() {
		return codigo_material;
	}
	public void setCodigo_material(int codigo_material) {
		this.codigo_material = codigo_material;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String[] getAutores() {
		return autores;
	}
	public void setAutores(String[] autores) {
		this.autores = autores;
	}
	public String getTipo_recurso() {
		return tipo_recurso;
	}
	public void setTipo_recurso(String tipo_recurso) {
		this.tipo_recurso = tipo_recurso;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Date getFecha_publicacion() {
		return fecha_publicacion;
	}
	public void setFecha_publicacion(Date fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}
	public int getNumero_paginas() {
		return numero_paginas;
	}
	public void setNumero_paginas(int numero_paginas) {
		this.numero_paginas = numero_paginas;
	}
	public String getDetalle_publicacion() {
		return detalle_publicacion;
	}
	public void setDetalle_publicacion(String detalle_publicacion) {
		this.detalle_publicacion = detalle_publicacion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String[] getBiblioteca() {
		return biblioteca;
	}
	public void setBiblioteca(String[] biblioteca) {
		this.biblioteca = biblioteca;
	}
	
	
	
}

