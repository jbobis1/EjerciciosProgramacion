package ejercicio.io;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicio.calculadora;

class calculadoraTest {

	@Test
	public void testSuma() {
		int resultado = calcu.Suma(10,2);
		int esperado = 12;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testResta() {
		int resultado = calculadora.Resta(10,2);
		int esperado = 8;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testMultiplicacion() {
		int resultado = calculadora.Multiplicacion(10,2);
		int esperado = 20;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testdivision1() {
		int resultado = calculadora.Division(10,2);
		int esperado = 5;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testdivision2() {
		int resultado = calculadora.Division(10,0);
		int esperado = 0;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testpar1() {
		boolean resultado = calculadora.esPar(10);
		boolean esperado = true;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testpar2() {
		boolean resultado = calculadora.esPar(5);
		boolean esperado = false;
		assertEquals(resultado,esperado);
	}
	@Test
	public void testmitadpar1() {
		int resultado = calculadora.mitadSiPar(5);
		int esperado = 5;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testmitadpar2() {
		int resultado = calculadora.mitadSiPar(10);
		int esperado = 5;
		assertEquals(resultado,esperado);
	}
	
	
}
