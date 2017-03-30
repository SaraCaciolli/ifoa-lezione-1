package centralino;

//import java.util.Date;

public class Main {
	
	int operatoriOccupati = 0;
	int MAX = 5;

public synchronized void decrementeOperatoriOccupati(){
		operatoriOccupati--;
		notify();
}
public synchronized void incrementaOperatoriOccupati(){
	operatoriOccupati++;
}
	
	public static void main(String[] args) throws InterruptedException{
	 Main main = new Main();
	 Cliente clienti[] = new Cliente[100];
	 for(int i=0; i<100;i++){
		 clienti[i] = new Cliente("" + i, null);
	 }
	 
	// Date t0 = new Date();
	 for(Cliente c: clienti){
		 main.serve(c);
		 System.out.println("Servito " + c.toString());
		 
	 }
}
	
	
	public synchronized void serve(Cliente c) throws InterruptedException{
		if(operatoriOccupati >= MAX)
			wait();
		incrementaOperatoriOccupati();
		Operatore o= new Operatore(c,this);
		Thread to = new Thread(o);
		to.start();
	}
}

