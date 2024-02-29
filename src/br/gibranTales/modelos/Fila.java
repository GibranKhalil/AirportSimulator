package br.gibranTales.modelos;

import java.util.ArrayList;

public class Fila  {
	
	private ListaLigada lista = new ListaLigada();
	private ArrayList<Aviao> listaAviao = new ArrayList<>();
	
	public void adicionar(Aviao elemento) {
		lista.adicionarNoFinal(elemento);
	}

	
	public void remover() {
		lista.removerDoComeco();
	}

	public void removerPosicao(int posicao){
		lista.removerNaPosicao(posicao);
	}
	public boolean ehVazia() {
		return lista.ehVazia();
	}
	
	public Aviao poll() {
		
		if (ehVazia()) {
			return null;
		}
		else {
			Aviao primeiro = lista.pegarPrimeiro();
			lista.removerDoComeco();
			return primeiro;
		}
	}
	
	public boolean contem(Aviao elemento) {
		return lista.contem(elemento);
	}
	
	public Aviao pegaPrimeiro() {
		return lista.pegarPrimeiro();
	}
	
	public Aviao pegaUltimo() {
		return lista.pegarUltima();
	}
	
	public int pegarTamanho() {
		return lista.pegarTotalElementos();
	}

	public void imprimirElementos(){
		for(int i = 0; i< lista.pegarTotalElementos(); i++){
			Aviao novaCelula = (Aviao) lista.pegar(i);
			listaAviao.add(novaCelula);
		}
	}

	public Aviao pegarPosicao(int posicao){
		return  lista.pegar(posicao);
	}

	@Override
	public String toString() {
		imprimirElementos();
		return listaAviao.toString();
	}
}
