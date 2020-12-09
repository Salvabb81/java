package org.sbrubixquert.example;

import org.sbrubixquert.pooinheritance.Alumno;
import org.sbrubixquert.pooinheritance.AlumnoInternacional;
import org.sbrubixquert.pooinheritance.Persona;
import org.sbrubixquert.pooinheritance.Profesor;

public class EjemploHerenciaConstructores {

	public static void main(String[] args) {

		System.out.println("======== CREANDO LA INSTANCIA DE ALUMNO ========");
		Alumno alumno = new Alumno("Salvador", "Bru", 14, "Instituo Nacional");
		alumno.setNotaLenguaje(5.5);
		alumno.setNotaHistoria(6.3);
		alumno.setNotaMatematicas(4.9);
		alumno.setEmail("salvabru@gmail.com");

		System.out.println("======== CREANDO LA INSTANCIA DE ALUMNO INTERNACIONAL ========");
		AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
		alumnoInt.setEdad(15);
		alumnoInt.setColegio("Instituo Nacional");
		alumnoInt.setNotaIdiomas(6.8);
		alumnoInt.setNotaLenguaje(6.2);
		alumnoInt.setNotaHistoria(5.8);
		alumnoInt.setNotaMatematicas(6.5);
		alumnoInt.setEmail("petergosling@gmail.com");

		System.out.println("======== CREANDO LA INSTANCIA DE PROFESOR ========");
		Profesor profesor = new Profesor("Luci", "Pérez", "Matemáticas");
		profesor.setEdad(37);
		profesor.setEmail("luciperez@gmail.com");

		System.out.println("======== --- ========");
		imprimir(alumno);
		imprimir(alumnoInt);
		imprimir(profesor);

	}

	public static void imprimir(Persona persona) {
		System.out.println("Imprimiendo los datos del tipo Persona: ");
		System.out.println("Nombre: " + persona.getNombre() + ", apellido: " + persona.getApellido() + ", edad: "
				+ persona.getEdad() + ", email: " + persona.getEmail());
		if (persona instanceof Alumno) {
			System.out.println("Impriendo los datos del tipo Alumno: ");
			System.out.println("Colegio: " + ((Alumno) persona).getColegio());
			System.out.println("Nota matemáticas: " + ((Alumno) persona).getNotaMatematicas());
			System.out.println("Nota lenguaje: " + ((Alumno) persona).getNotaLenguaje());
			System.out.println("Nota historia: " + ((Alumno) persona).getNotaHistoria());

			System.out.println("Imprimiendo los datos del tipo Alumno internacional: ");
			if (persona instanceof AlumnoInternacional) {
				System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
				System.out.println("País: " + ((AlumnoInternacional) persona).getPais());
			}
			System.out.println("======================= sobre escritura nota promedio ========================");
			System.out.println("Promedio: " + ((Alumno)persona).calcularPromedio());
		}
		if (persona instanceof Profesor) {
			System.out.println("Imprimiendo los datos del tipo Profesor: ");
			System.out.println("Asignatura: " + ((Profesor)persona).getAsignatura());
		}
		System.out.println("===============================================");
		System.out.println(persona.saludar());
		System.out.println("===============================================");
	}
}
