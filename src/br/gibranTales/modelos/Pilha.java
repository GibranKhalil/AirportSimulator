package br.gibranTales.modelos;


public class Pilha {
	
	private ListaLigada lista = new ListaLigada();
	
	public void push(Aviao novoElemento) {
		lista.adicionarNoFinal(novoElemento);
	}
	
	public void pop() {
		lista.removerDoFinal();
	}
	
	public Aviao top() {  //peek
		return lista.pegarUltima();
	}
	
	public boolean contem(Aviao elemento) {
		return lista.contem(elemento);
	}
	
	public int pegarTamanho() {
		return lista.pegarTotalElementos();
	}
	
	public Object pegarPrimeiro() {
		return lista.pegarPrimeiro();
	}
}
