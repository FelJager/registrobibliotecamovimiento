package Modelo;

import java.util.Date;

public class modelo_Material {
	int codigo;
	String titulo;
	String [] autores;
	String tipo_recurso;
	String editorial;
	Date fecha_publicacion;
	int numero_paginas;
	String detalle_publicacion;
	
	public modelo_Material(int codigo, String titulo, String[] autores, String tipo_recurso, String editorial, Date fecha_publicacion, int numero_paginas, String detalle_publicacion) 
	{
		this.codigo = codigo;
		this.titulo = titulo;
		this.autores = autores;
		this.tipo_recurso = tipo_recurso;
		this.editorial = editorial;
		this.fecha_publicacion = fecha_publicacion;
		this.numero_paginas = numero_paginas;
		this.detalle_publicacion = detalle_publicacion;
	}
	
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	
	
	
	
}
