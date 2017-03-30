package mythread;

public class Main {
private static Outputter out = new Outputter() {
		
	@Override
	public void println(String s) {
//			// TODO Auto-generated method stub
	System.out.println(s);
			
	}  
};


	
	public static void main(String[] args) throws InterruptedException{
		
		CountingOutputterIntelligente outi = new CountingOutputterIntelligente(out);
		
		
		//		costruire 2 MyThead
		MyThread myt1 = new MyThread("Thread1", 100, outi);
		MyThread myt2 = new MyThread("Thread2", 100, outi);
		
		Thread t1 = new Thread(myt1);
		Thread t2 = new Thread(myt2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		outi.Flush();
	}
}
