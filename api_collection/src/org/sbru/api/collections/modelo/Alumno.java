package org.sbru.api.collections.modelo;

public class Alumno implements Comparable<Alumno>{

	private String nombre;
	private Integer nota;

	public Alumno(String nombre, int nota) {
		super();
		this.setNombre(nombre);
		this.setNota(nota);
	}
	
	public Alumno() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return nombre + ", nota=" + nota;
	}

	@Override
	public int compareTo(Alumno a) {
//		if(this.nombre == null) {
//			return 0;
//		}
//		return this.nombre.compareTo(a.nombre);
		if(this.nota == null) {
			return 0;
		}
		return this.nota.compareTo(a.nota);
	}

}
