package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.Arrayss;

class testMedia {

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
		float numEsperado = 5;
		float numObtenido = Arrayss.mediaNotas(valido);
		assertEquals(numEsperado,numObtenido);
	}
	
	@Test
	void noValido() {
		float numEsperado = 5;
		float numObtenido = Arrayss.mediaNotas(noValido);
		assertEquals(numEsperado,numObtenido);
	}
	
	@Test
	void cinco() {
		float numEsperado = 5;
		float numObtenido = Arrayss.mediaNotas(cinco);
		assertEquals(numEsperado,numObtenido);
	}

}
