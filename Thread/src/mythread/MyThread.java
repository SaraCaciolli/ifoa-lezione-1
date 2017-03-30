package mythread;

public class MyThread implements Runnable {
	private String nome;
	private int num;
	private Outputter out;
	
	public MyThread(String nome, int num, Outputter out) {
		this.nome = nome;
		this.num = num;
		this.out = out;
	}
	
	@Override
	public void run() {
		for (int i = 0; i<num; i++){
			//System.out.println(nome);
			out.println(nome);
		}
	}

}
