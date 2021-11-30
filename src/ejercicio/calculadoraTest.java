package ejercicio;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculadoraTest {

	@Test
	public void testSuma() {
		int resultado = calculadora.Suma(10, 2);
		int esperado = 12;
		
		assertEquals(resultado,esperado);
	} 
	
	@Test
	public void testResta() {
		int resultado = calculadora.Resta(10, 2);
		int esperado = 8;
		
		assertEquals(resultado, esperado);
	}

	@Test
	public void testDivision1() {
		 int resultado = calculadora.Division(5, 0);
		 int esperado = 0;
		 
		 assertEquals(resultado,esperado);
	}
	
	@Test
	public void testDivision2() {
		int resultado = calculadora.Division(5, 2);
		int esperado = 2;
		
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testMultiplicacion() {
		int resultado = calculadora.Multiplicacion(10, 2);
		int esperado = 20;
		
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testmitadSiPar() {
		int resultado = calculadora.mitadSiPar(10);
		int esperado = 5;
		
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testmitasSiPar2() {
		int resultado = calculadora.mitadSiPar(3);
		int esperado = 3;
		
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testesPar() {
		boolean resultado = calculadora.esPar(2);
		boolean esperado = true;
		
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testesPar2() {
		boolean resultado = calculadora.esPar(3);
		boolean esperado = false;
		
		assertEquals(resultado, esperado);
	}
	

}

