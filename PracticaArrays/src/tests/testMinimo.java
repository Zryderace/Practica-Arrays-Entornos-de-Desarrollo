package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.Arrayss;

class testMinimo {

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
		int numEsperado = 1;
		int numObtenido = Arrayss.minimaNota(valido);
		assertEquals(numEsperado,numObtenido);
	}
	
	@Test
	void noValido() {
		int numEsperado = -1;
		int numObtenido = Arrayss.minimaNota(noValido);
		assertEquals(numEsperado,numObtenido);
	}
	
	@Test
	void cinco() {
		int numEsperado = 5;
		int numObtenido = Arrayss.minimaNota(cinco);
		assertEquals(numEsperado,numObtenido);
	}

}
