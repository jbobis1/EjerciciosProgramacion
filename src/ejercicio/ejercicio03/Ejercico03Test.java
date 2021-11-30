package ejercicio.ejercicio03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercico03Test {

	@Test
	public void ocurenciastest() {
		int resultado = Ejercico03.numero("holaaa");
		int esperado = 3;
		assertEquals(resultado,esperado);
	}
	@Test
	public void ocurenciastest2() {
		int resultado = Ejercico03.numero("bbb");
		int esperado = 0;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void ocurenciastest3() {
		int resultado = Ejercico03.numero("11");
		int esperado = 0;
		assertEquals(resultado,esperado);
	}
}
