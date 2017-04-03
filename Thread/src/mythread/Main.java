package mythread;

import java.util.ArrayList;
import java.util.List;

public class Main {
private static Outputter out = new Outputter() {
		
	@Override
	public void println(String s) {
	System.out.println(s);
			
	}  
};


	
	public static void main(String[] args) throws InterruptedException{
		
		//CountingOutputterIntelligente outi = new CountingOutputterIntelligente(out);
		CountingOutputterMoltoIntelligente outi = new CountingOutputterMoltoIntelligente(out);
		List<MyThread> mts = new ArrayList<>();
		
		for(int i=0; i<10; i++){
		MyThread myt = new MyThread("Thread"+i, 100, outi);
			mts.add(myt);
		}
		
		List<Thread> ts = new ArrayList<>();
		for(MyThread mt : mts){
			Thread t = new Thread(mt);
			ts.add(t);
		}
		for(Thread t: ts){
			t.start();
		}
		for(Thread t: ts){
			t.join();
		}
		
//		MyThread myt1 = new MyThread("Thread1", 100, outi);
//		MyThread myt2 = new MyThread("Thread2", 100, outi);
//		
//		Thread t1 = new Thread(myt1);
//		Thread t2 = new Thread(myt2);
//		
//		t1.start();
//		t2.start();
//		
//		t1.join();
//		t2.join();
		
		outi.flush();
	}
}
