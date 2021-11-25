package entorno;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicio.io.calcu;

class CalculadoraTest {


	@Test
	public void testSuma() {
		int resultado = Calculadora.suma(10,2);
		int esperado = 12;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testResta() {
		int resultado = Calculadora.resta(10,2);
		int esperado = 8;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testMultiplicacion() {
		int resultado = Calculadora.multiplicaccion(10,2);
		int esperado = 20;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testdivision1() {
		int resultado = Calculadora.division(10,2);
		int esperado = 5;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testdivision2() {
		int resultado = Calculadora.division(10,0);
		int esperado = 0;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testpar1() {
		boolean resultado = Calculadora.par(10);
		boolean esperado = true;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testpar2() {
		boolean resultado = Calculadora.par(5);
		boolean esperado = false;
		assertEquals(resultado,esperado);
	}
	@Test
	public void testmitadpar1() {
		int resultado = Calculadora.mitadpar(5);
		int esperado = 5;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testmitadpar2() {
		int resultado = Calculadora.mitadpar(10);
		int esperado = 5;
		assertEquals(resultado,esperado);
	}
	
	
}