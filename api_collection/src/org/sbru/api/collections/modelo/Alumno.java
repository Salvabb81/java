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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((nota == null) ? 0 : nota.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (nota == null) {
			if (other.nota != null)
				return false;
		} else if (!nota.equals(other.nota))
			return false;
		return true;
	}
	
	

}
