package br.gibranTales.modelos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AeroportoTest {

	@Test
	void testAdicionarAviao() {
		Aviao aviao = new Aviao();
		
		assertNotNull(aviao.getCombustivelAviao());
		assertNotNull(aviao.getIdAviao());
	}
	
	@Test
	void testAdicionarAviaoNaFila() {
		Aviao aviao = new Aviao();
		Pista pista = new Pista();
		
		pista.adicionarAviaoNaPista(aviao);
		
		assertEquals(aviao, pista.getListaFilas().get(0).pegarPosicao(0)); 
		
	}

}
