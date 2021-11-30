package ejercicio.factoral;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	public void Factorialtest1() {
		int resultado = Factorial.factorial(5);
		int esperado = 120;
		
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void Factorialtest2() {
		int resultado = Factorial.factorial(-5);
		int esperado = -5;
		
		assertEquals(resultado,esperado);
	}
}
