package esercizio.generics;

public class Pila<T> {

	private T[] pila;

	public Pila(T[] t) {
		this.pila = t;
	}

	public boolean inserisci(T oggetto) {
		for (int i = 0; i < pila.length; i++) {
			if (pila[i] == null) {
				pila[i] = oggetto;
				return true;
			}
		}
		return false;
	}

	public T estrai() {
		for (int i = pila.length - 1; i > 0; i--) {
			if (pila[i] != null) {
				pila[i] = null;
				return pila[i];
			}
		}
		return null;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < pila.length; i++) {
			s += (pila[i] + " ");
		}
		return s;
	}
}
