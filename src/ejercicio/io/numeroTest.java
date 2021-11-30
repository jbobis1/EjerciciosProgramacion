package ejercicio.io;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numeroTest {

	@Test
	public void testSuma1() {
		int resultado = numero.pedir(10,10);
		int esperado = 10;
		assertEquals(resultado,esperado);
	}
	
	public void testSuma2() {
		int resultado = numero.pedir(10,2);
		int esperado = 0;
		assertEquals(resultado,esperado);
	}
	
	public void testiguales1() {
		boolean resultado = numero.iguales(10);
		boolean esperado = true;
		assertEquals(resultado,esperado);
	}
	public void testiguales2() {
		boolean resultado = numero.iguales(5);
		boolean esperado = false;
		assertEquals(resultado,esperado);
	}


}
