package my.own.company.prova0;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimoTest {

	@Test
	public void testCorreggiOperazioni() {
		String s = Primo.correggiOperazione("1+1");
		assertTrue("1 + 1".equals(s));
		
	}@Test
	public void testBasicPlus() {
		double res = Primo.calcolaRisultato("1 + 4");
		assertTrue(res == 5);
		
	}
	
	@Test
	public void testBasicMinus() {
		double res = Primo.calcolaRisultato("1 - 4");
		assertTrue(res == -3);
		
	}

}
