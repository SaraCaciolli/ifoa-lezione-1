package centralino;

public class Operatore implements Runnable{

	private Cliente c;
	private Main main;
	
	public Operatore(Cliente c, Main main) {
		this.c = c;
		this.main = main;
	}

	@Override
	public void run() {
		try{
			System.out.println("Serving: "+ c);
			Thread.sleep(1000);
			main.decrementeOperatoriOccupati();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
