package br.gibranTales.modelos;

public class Celula {
	
	private Aviao elemento;
	private Celula proximo;
	private Celula anterior;
	
	
	public Celula(Aviao elemento) {
		this(elemento, null);
	}
	
	public Celula(Aviao elemento, Celula proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public Aviao getElemento() {
		return elemento;
	}

	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	public Celula getAnterior() {
		return anterior;
	}
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return "Avião: " + this.elemento;
	}
}
