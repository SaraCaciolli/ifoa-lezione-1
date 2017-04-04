package mythread;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	private static Outputter out = new Outputter() {

		@Override
		public void println(String s) {
			System.out.println(s);

		}
	};
	// private static Outputter out2 = (String s) -> System.out.println(s);
	// private static Outputter out3 = (s) -> System.out.println(s);
	// private static Outputter out99 = System.out::println;

	public static class FilteringOutputter implements Outputter {
		private Outputter out;
		private Outputter statistiche;
		private Predicate<String> p;

		public FilteringOutputter(Outputter out, Outputter statistiche, Predicate<String> p) {
			this.out = out;
			this.statistiche = statistiche;
			this.p = p;
		}

		@Override
		public void println(String s) {
			if (p.test(s)) {
				statistiche.println(s);
			}

			out.println(s);

		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		CountingOutputterMoltoIntelligente outi = new CountingOutputterMoltoIntelligente((s) -> {});
		FilteringOutputter out9 = new FilteringOutputter(out, outi, s -> s.startsWith("Thread9"));
		// CountingOutputterIntelligente outi = new
		// CountingOutputterIntelligente(out);

		List<MyThread> mts = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			MyThread myt = new MyThread("Thread" + i, 100, out9);
			mts.add(myt);
		}

		List<Thread> ts = new ArrayList<>();
		for (MyThread mt : mts) {
			Thread t = new Thread(mt);
			ts.add(t);
		}
		for (Thread t : ts) {
			t.start();
		}
		for (Thread t : ts) {
			t.join();
		}

		// MyThread myt1 = new MyThread("Thread1", 100, outi);
		// MyThread myt2 = new MyThread("Thread2", 100, outi);
		//
		// Thread t1 = new Thread(myt1);
		// Thread t2 = new Thread(myt2);
		//
		// t1.start();
		// t2.start();
		//
		// t1.join();
		// t2.join();

		outi.flush();
	}

	// @Override
	// public void println(String s) {
	// // TODO Auto-generated method stub
	//
	// }
}
