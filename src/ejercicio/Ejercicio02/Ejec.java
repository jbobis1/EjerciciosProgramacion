package ejercicio.Ejercicio02;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Ejec {
	@Test
	public void mayortest1() {
		int resultado = Ejercicio02.mayor(10, 2,6);
		int esperado = 10;
		assertEquals(resultado,esperado);
	}
	@Test
	public void mayortest2() {
		int resultado = Ejercicio02.mayor(2, 5,1);
		int esperado = 5;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void mayortest3() {
		int resultado = Ejercicio02.mayor(2, 5,15);
		int esperado = 15;
		assertEquals(resultado,esperado);
	}
}
