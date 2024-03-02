package br.gibranTales.modelos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AeroportoTest {

	@Test
	void testAdicionarAviao() {
		Aviao aviao = new Aviao();
		
		assertNotNull(aviao.getCombustivelAviao());
		assertNotNull(aviao.getIdAviao());
	}

}
