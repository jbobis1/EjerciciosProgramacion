package ejercicio.ejercicio04;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicio.Ejercicio02.Ejercicio02;

class Ejercicio04Test {

	@Test
	public void numerostest1() {
		double resultado =  Ejercicio04.numeros(-5, 2, 0);
		double esperado = 0;
		assertEquals(resultado,esperado);
	}
	@Test
	public void numerostest2() {
		double resultado = Ejercicio04.numeros(5, -2, 0);
		double esperado = 0;
		assertEquals(resultado,esperado);
	}
	@Test
	public void numerostest3() {
		double resultado = Ejercicio04.numeros(5, 10, 7.5);
		double esperado = 7.5;
		assertEquals(resultado,esperado);
	}

}
