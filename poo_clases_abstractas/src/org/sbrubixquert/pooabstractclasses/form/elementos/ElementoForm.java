package org.sbrubixquert.pooabstractclasses.form.elementos;

public abstract class ElementoForm {

	protected String valor;
	protected String nombre;

//	public ElementoForm() {
//	}

	public ElementoForm(String nombre) {
//		this();
		this.nombre = nombre;
	}

	public abstract String dibujarHtml();

	public void setValor(String valor) {
		this.valor = valor;
	}

}
