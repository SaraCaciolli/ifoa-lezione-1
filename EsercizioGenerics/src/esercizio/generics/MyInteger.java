package esercizio.generics;

public class MyInteger implements PrintInterface {
	Integer i;


public MyInteger(Integer i) {
		this.i = i;
	}

@Override
public void stampaDetails(){
	System.out.println(String.valueOf(i));
}
	
}
