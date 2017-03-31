package esercizio.generics;

public class Main {
	
	public static void main(String[] args){
		Integer[] arr = {1,2,3,4,5};
		Pila<Integer> pila = new Pila<Integer>(arr);
		System.out.println(pila.toString());
	}
	
}
