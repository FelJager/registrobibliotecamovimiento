package Modelo;

public class Modelo_Material {

	private String codigo_material;
	private String imagen;
	private String titulo;
	private String[] Autores;
	private String autor1;
	private String autor2;
	private String autor3;
	private String tipo_recurso;
	private String editorial;
	private String anio_publicacion;
	private int numero_paginas;
	private String detalle_publicacion;
	private String biblioteca1;
	private String biblioteca2;
	private String estado;
	
	
	public Modelo_Material(String codigo_material, String imagen, String titulo, String[] autores, String autor1,
			String autor2, String autor3, String tipo_recurso, String editorial, String anio_publicacion,
			int numero_paginas, String detalle_publicacion, String biblioteca1, String biblioteca2, String estado) {
		this.codigo_material = codigo_material;
		this.imagen = imagen;
		this.titulo = titulo;
		Autores = autores;
		this.autor1 = autor1;
		this.autor2 = autor2;
		this.autor3 = autor3;
		this.tipo_recurso = tipo_recurso;
		this.editorial = editorial;
		this.anio_publicacion = anio_publicacion;
		this.numero_paginas = numero_paginas;
		this.detalle_publicacion = detalle_publicacion;
		this.biblioteca1 = biblioteca1;
		this.biblioteca2 = biblioteca2;
		this.estado = estado;
	}


	public String getCodigo_material() {
		return codigo_material;
	}


	public void setCodigo_material(String codigo_material) {
		this.codigo_material = codigo_material;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String[] getAutores() {
		return Autores;
	}


	public void setAutores(String[] autores) {
		Autores = autores;
	}


	public String getAutor1() {
		return autor1;
	}


	public void setAutor1(String autor1) {
		this.autor1 = autor1;
	}


	public String getAutor2() {
		return autor2;
	}


	public void setAutor2(String autor2) {
		this.autor2 = autor2;
	}


	public String getAutor3() {
		return autor3;
	}


	public void setAutor3(String autor3) {
		this.autor3 = autor3;
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


	public String getAnio_publicacion() {
		return anio_publicacion;
	}


	public void setAnio_publicacion(String anio_publicacion) {
		this.anio_publicacion = anio_publicacion;
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


	public String getBiblioteca1() {
		return biblioteca1;
	}


	public void setBiblioteca1(String biblioteca1) {
		this.biblioteca1 = biblioteca1;
	}


	public String getBiblioteca2() {
		return biblioteca2;
	}


	public void setBiblioteca2(String biblioteca2) {
		this.biblioteca2 = biblioteca2;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
}
