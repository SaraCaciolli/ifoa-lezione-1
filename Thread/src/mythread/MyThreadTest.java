package mythread;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyThreadTest {

	@Test
	public void testEffettivamenteStampaIlSuoNome() {
		// voglio verificare che Mythread stampi il suo nome
		String NOME = "nome";
		// costruire MyThread
		MyThread myt = new MyThread(NOME, 20, 
		new Outputter() {
			@Override
			public void println(String s){
				if(! NOME.equals(s)){
					fail("unexpected Result: " + s + "!=" + NOME);
				}
			}
		});
		//eseguire run 
		myt.run();
		
		assertTrue(true); //successo
	}
	
	public class CountingOutputter implements Outputter{
		int count = 0;
		@Override
		public void println(String s){
			count ++;
		}
		public int getCount(){
			return count;
		}
	}
	
	@Test	
	public void testVerificaNumeroVolte() {
		// voglio verificare che Mythread stampi un numero deciso di volte
		int NUM = 10;
		CountingOutputter count = new CountingOutputter();
		// costruire MyThread
		MyThread myt = new MyThread("ciao", NUM, count); 
		
		//eseguire run 
		myt.run();
		
		assertTrue(count.getCount() == NUM); //successo
	}

}
