package org.sbrubixquert.pooinheritance;

public class Alumno extends Persona {

	private String colegio;
	private double notaMatematicas;
	private double notaLenguaje;
	private double notaHistoria;

	public Alumno() {
		System.out.println("Alumno: inicializando constructor...");
	}

	public Alumno(String nombre, String apellido) {
		super(nombre, apellido);
	}

	public Alumno(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
	}

	public Alumno(String nombre, String apellido, int edad, String colegio) {
		super(nombre, apellido, edad);
		this.colegio = colegio;
	}

	public Alumno(String nombre, String apellido, int edad, String colegio, double notaMatematicas, double notaHistoria,
			double notaLenguaje) {
		this(nombre, apellido, edad, colegio);
		this.notaMatematicas = notaMatematicas;
		this.notaHistoria = notaHistoria;
		this.notaLenguaje = notaLenguaje;
	}

	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}

	public double getNotaMatematicas() {
		return notaMatematicas;
	}

	public void setNotaMatematicas(double notaMatematicas) {
		this.notaMatematicas = notaMatematicas;
	}

	public double getNotaLenguaje() {
		return notaLenguaje;
	}

	public void setNotaLenguaje(double notaLenguaje) {
		this.notaLenguaje = notaLenguaje;
	}

	public double getNotaHistoria() {
		return notaHistoria;
	}

	public void setNotaHistoria(double notaHistoria) {
		this.notaHistoria = notaHistoria;
	}
	
	@Override
	public String saludar() {
		String saludar = super.saludar();
		return saludar + " soy un alumno y mi nombre es " + getNombre();
	}
	
	public double calcularPromedio() {
		//System.out.println("CalcularPromedio " + Alumno.class.getCanonicalName());
		return (notaHistoria + notaLenguaje + notaHistoria)/3;
	}

	@Override
	public String toString() {
		return super.toString() + System.lineSeparator() + " colegio=" + colegio + ", notaMatematicas=" + notaMatematicas + ", notaLenguaje=" + notaLenguaje
				+ ", notaHistoria=" + notaHistoria + ", promedio=" + this.calcularPromedio();
	}
	
	
}
