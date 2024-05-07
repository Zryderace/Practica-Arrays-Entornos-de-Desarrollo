package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.Arrayss;

class testMaximo {

	private static int[] valido;
	private static int[] noValido;
	private static int[] cinco;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		valido = new int[] {1,5,9};
		noValido = new int[] {20,5,35};
		cinco = new int[] {5,5,5,5,5};
	}
	
	@Test
	void valido() {
		float numEsperado = 9;
		float numObtenido = Arrayss.maximaNota(valido);
		assertEquals(numEsperado,numObtenido);
	}
	
	@Test
	void noValido() {
		float numEsperado = -1;
		float numObtenido = Arrayss.maximaNota(noValido);
		assertEquals(numEsperado,numObtenido);
	}
	
	@Test
	void cinco() {
		float numEsperado = 5;
		float numObtenido = Arrayss.maximaNota(cinco);
		assertEquals(numEsperado,numObtenido);
	}

}
