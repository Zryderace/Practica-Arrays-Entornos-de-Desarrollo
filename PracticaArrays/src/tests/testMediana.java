package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.Arrayss;

class testMediana {

	private static int[] par;
	private static int[] impar;
	private static int[] noValido;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		impar = new int[] {1,5,9};
		par = new int[] {9,5,6,2};
		noValido = new int[] {20,5,35};
	}

	@Test
	void impar() {
		float numEsperado = 5;
		float numObtenido = Arrayss.medianaNotas(impar);
		assertEquals(numEsperado,numObtenido);
	}
	
	@Test
	void par() {
		float numEsperado = (float) 5.5;
		float numObtenido = Arrayss.medianaNotas(par);
		assertEquals(numEsperado,numObtenido);
	}
	
	@Test
	void noValido() {
		float numEsperado = -1;
		float numObtenido = Arrayss.medianaNotas(noValido);
		assertEquals(numEsperado,numObtenido);
	}

}
