package ejercicio.ejercicio03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercico03Test {

	@Test
	public void ocurenciastest() {
		String resultado = Ejercico03.numero("holaaa", "holaaa");
		String esperado = "holee";
		assertEquals(resultado,esperado);
	}
	@Test
	public void ocurenciastest2() {
		String resultado = Ejercico03.numero("bbb","bbb");
		String esperado = "bbb";
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void ocurenciastest3() {
		String resultado = Ejercico03.numero("11","11");
		String esperado = "11";
		assertEquals(resultado,esperado);
	}
}
