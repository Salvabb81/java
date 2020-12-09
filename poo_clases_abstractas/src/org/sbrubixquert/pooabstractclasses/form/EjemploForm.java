package org.sbrubixquert.pooabstractclasses.form;

import java.awt.TextArea;

import org.sbrubixquert.pooabstractclasses.form.elementos.InputForm;
import org.sbrubixquert.pooabstractclasses.form.elementos.SelectForm;
import org.sbrubixquert.pooabstractclasses.form.elementos.select.Opcion;

public class EjemploForm {

	public static void main(String[] args) {
		InputForm username = new InputForm("username");
		InputForm password = new InputForm("clave", "password");
		InputForm email = new InputForm("email", "email");
		InputForm edad = new InputForm("edad", "number");

		TextArea experiencia = new TextArea("exp", 5, 9);

		SelectForm lenguaje = new SelectForm("lenguaje");
		Opcion java = new Opcion("1", "java");
		lenguaje.addOpcion(java);
		lenguaje.addOpcion(new Opcion("2", "Python"));
		lenguaje.addOpcion(new Opcion("3", "Javascript"));
		lenguaje.addOpcion(new Opcion("4", "TypeScript"));
		lenguaje.addOpcion(new Opcion("5", "PHP"));
		
		username.setValor("john.doe");
		password.setValor("123456");
		email.setValor("john.doe@correo.com");
		edad.setValor("29");
		java.setSelected(true);
	}
}
