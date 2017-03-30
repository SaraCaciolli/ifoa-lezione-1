package anagrafica.persone;

import java.util.Scanner;

public class Main{
	private static Scanner scanner;

	private static Persona[] persons = new Persona[5];
	
	public static void main(String[] args) {
		
		//List<String> listaPersone = new ArrayList<>();
		
		System.out.println("Benvenuto");
		scanner = new Scanner(System.in);
		int len=0;
		printMsg();
		while(scanner.hasNext()) {
			String s = scanner.nextLine();
			if("q".equals(s)) {
				System.out.println("Ciao Ciao Alla Prossima");
			}
			if("l".equals(s)) {
				System.out.println("Hai Inserito "+len+" Persona/e");
				printMsg();
				continue;
			}
			if("d".equals(s)) {
				for(int p=0;p<len;p++) {
				Persona person = persons[p];	
					person.printFullDetails();
				}
				printMsg();
				continue;
			}
			if(len>=2) {
				System.err.println("Non Puoi Inserire Altre Persone.");
				printMsg();
				continue;
			}
			if("i".equals(s)){
			System.out.println("Inserisci i Seguenti Dati.");

			System.out.println("Nome:");
			String nome=scanner.nextLine();
	
			System.out.println("Cogome:");
			String cognome=scanner.nextLine();
	
			System.out.println("Codice Fiscale:");
			String codiceFiscale=scanner.nextLine();
			System.out.println("Grazie per i dati inseriti.");
			Persona persona = new Persona(nome, cognome, codiceFiscale);
			persons[len++] = persona;
	
			persona.printFullDetails();
			printMsg();
			}
		}
	}
	
	public static void printMsg() {
		System.out.println("Premi: ");
		System.out.println(" - Q Per Uscire ");
		System.out.println(" - L Per Sapere Il Numero delle Persone Inserite");
		System.out.println(" - D Per Leggere La Lista dei Dati Delle Persone Inserite");
		System.out.println(" - I Per Inserire Un Nuova Per Inserire Nuove Persone");
	}

}
