package org.sbrubixquert.pooinheritance;

public class AlumnoInternacional extends Alumno {
	private String pais;
	private double notaIdiomas;

	public AlumnoInternacional() {
		System.out.println("Alumno Internacional: inicializando el contructor...");
	}
	
	public AlumnoInternacional (String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	public AlumnoInternacional (String nombre, String apellido, String pais) {
		super(nombre, apellido);
		this.pais = pais;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getNotaIdiomas() {
		return notaIdiomas;
	}

	public void setNotaIdiomas(double notaIdiomas) {
		this.notaIdiomas = notaIdiomas;
	}
	
	@Override
	public String saludar() {
		return super.saludar() + ". Soy extranjero de " + getPais() + ".";
	}
	
	@Override
	public double calcularPromedio() {
		//System.out.println("CalcularPromedio " + AlumnoInternacional.class.getCanonicalName());
		return ((super.calcularPromedio()*3) + notaIdiomas) /4;
	}

	@Override
	public String toString() {
		return super.toString() + System.lineSeparator() + "pais=" + pais + ", notaIdiomas=" + notaIdiomas;
	}

}
