package esercizio.generics;

public class Main {
	
	public static void main(String[] args){
		//Integer[] arr = {1,2,3,4,5};
		//Pila<Integer> pila = new Pila<Integer>(arr);
		//System.out.println(pila.toString());
		
		Persona[] persone = new Persona[10];
		Pila<Persona> p = new Pila<Persona>(persone);
		p.inserisci(new Persona("sara", "xgfrffg", "tirurtreire"));
		
		MyInteger[] arr = new MyInteger[10];
		Pila<MyInteger> pila = new Pila<MyInteger>(arr);
		pila.inserisci(new MyInteger(9));		
		
	}
	
	
	
}
