package my.own.company.prova0;
import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		
	
			//String operazioni = String.join(" ", args);

			{
				String operazioni = "1 +    4";
				System.out.println(operazioni);
				calcolaRisultato(operazioni);
				System.out.println("-----");
			}

			{
				String operazioni = "1 -4";
				System.out.println(operazioni);
				calcolaRisultato(operazioni);
				System.out.println("-----");
			}
	}
	
	static void calcolaRisultato(String operazioni)
	{
String operazioniCorretto = correggiOperazione(operazioni);
		
		double amount = 0;
		Scanner s= new Scanner(  operazioniCorretto );


		if(s.hasNext()) {
			double firstElement = s.nextDouble();
			amount = firstElement;
		}	
		while(s.hasNext()) {	
			String a = s.next("[+-]");
			double value = s.nextDouble();

			if(a.equals("+"))
				amount += value;
			else
				amount -= value;

			System.err.println("operatore: " + a);
			System.err.println("value: " + value);
			System.err.println("amount: " + amount);
		}

		s.close();
		System.out.println("amount:" + amount);
	}

	private static String correggiOperazione(String operazioni) {
		String res = ""; 
		for(int i = 0 ; i < operazioni.length(); i++) {
			String v = operazioni.substring(i, i+1);
			//System.err.println("char at " + i + " = [" + v + "]");
			if("+".equals(v) | "-".equals(v)) 
				res += " " + v + " ";
			else 
				res += v;
		}
		return res;
	}

}
