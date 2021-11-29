package entorno;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class NumeroTest {
	

	@Test
	public void testiguales1() {
		boolean resultado = Numero.iguales(10,10);
		boolean esperado = true;
		assertEquals(resultado,esperado);
	}
	@Test
	public void testiguales2() {
		boolean resultado = Numero.iguales(10,5);
		boolean esperado = false;
		assertEquals(resultado,esperado);
	}


}
