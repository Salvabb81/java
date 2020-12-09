package org.sbrubixquert.example;

import org.sbrubixquert.pooinheritance.Alumno;
import org.sbrubixquert.pooinheritance.AlumnoInternacional;
import org.sbrubixquert.pooinheritance.Profesor;

public class EjemploHerencia {

	public static void main(String[] args) {
		
		System.out.println("======== CREANDO LA INSTANCIA DE ALUMNO ========");
		Alumno alumno = new Alumno();
		alumno.setNombre("Salvador");
		alumno.setApellido("Bru");
		alumno.setColegio("Instituo Nacional");
		alumno.setNotaLenguaje(5.5);
		alumno.setNotaHistoria(6.3);
		alumno.setNotaMatematicas(4.9);

		System.out.println("======== CREANDO LA INSTANCIA DE ALUMNO INTERNACIONAL ========");
		AlumnoInternacional alumnoInt = new AlumnoInternacional();
		alumnoInt.setNombre("Peter");
		alumnoInt.setApellido("Gosling");
		alumnoInt.setEdad(15);
		alumnoInt.setPais("Australia");
		alumnoInt.setColegio("Instituo Nacional");
		alumnoInt.setNotaIdiomas(6.8);
		alumnoInt.setNotaLenguaje(6.2);
		alumnoInt.setNotaHistoria(5.8);
		alumnoInt.setNotaMatematicas(6.5);

		System.out.println("======== CREANDO LA INSTANCIA DE PROFESOR ========");
		Profesor profesor = new Profesor();
		profesor.setNombre("Luci");
		profesor.setApellido("Pérez");
		profesor.setAsignatura("Matemáticas");

		System.out.println("======== --- ========");
		System.out.println(alumno.getNombre() + " " + alumno.getApellido());
		System.out.println(alumnoInt.getNombre() + " " + alumnoInt.getApellido() 
		+ " " + alumnoInt.getColegio() + " " + alumnoInt.getPais());
		
		System.out.println(
				"Profesor: " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());

		Class clase = alumnoInt.getClass();
		while (clase.getSuperclass() != null) {
			String subClass = clase.getName();
			String superClass = clase.getSuperclass().getName();
			System.out.println(subClass + " es una clase hija de la clase padre " + superClass);
			clase = clase.getSuperclass();
		}
	}
}
