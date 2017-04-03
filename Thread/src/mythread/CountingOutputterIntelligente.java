package mythread;

public class CountingOutputterIntelligente implements Outputter {

	private String ultimo = "";
	private int numero = 0;
	private Outputter delegate;
	private String buffer = "";

	
	public CountingOutputterIntelligente(Outputter delegate) {
		this.delegate = delegate;
	}
	
	@Override
	public synchronized void println(String s){
		if(ultimo.equals(s)){
			numero++;
	
		} else {
			if(numero>0){
				buffer += (ultimo + " è stato visto " + numero + " volte \n");
				System.out.println(ultimo + "è stato visto " + numero + " volte \n");
				System.out.println("iniziamoto con: " + s);
		}
			ultimo = s;
			numero=1;
		} 
		delegate.println(s);
	}
	 
	public void Flush(){
		buffer += (ultimo + " è stato visto " + numero + " volte \n");
		System.out.println("Closing");
		ultimo = "";
		System.out.println(buffer);
	}
	
	
}
