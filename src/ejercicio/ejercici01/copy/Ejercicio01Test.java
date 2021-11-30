package ejercicio.ejercici01.copy;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicio.calculadora;

class Ejercicio01Test {

	@Test
	public void mayortest1() {
		int resultado = Ejercicio01.mayor(10, 2);
		int esperado = 10;
		assertEquals(resultado,esperado);
	}
	@Test
	public void mayortest2() {
		int resultado = Ejercicio01.mayor(2, 5);
		int esperado = 5;
		assertEquals(resultado,esperado);
	}

}
