package ejercicio.lapices;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LapicesTest {
	
	@Test
	public void Lapicestest1() {
	float resultado =(int) Lapices.lapices(5 , (float) 0.20, (float) 1.0);
	float esperado = (float) 1.0;
	assertEquals(resultado,esperado);
	}
	@Test
	public void Lapicestest2() {
	float resultado =(int) Lapices.lapices(60 , (float) 0.20, (float) 2.4);
	float esperado = (float) 2.4;
	assertEquals(resultado,esperado);
	}
	
	@Test
	public void Lapicestest3() {
	float resultado =(int) Lapices.lapices(120 , (float) 0.20, (float) 12.0);
	float esperado = (float)12.0;
	assertEquals(resultado,esperado);
	
	}
}
