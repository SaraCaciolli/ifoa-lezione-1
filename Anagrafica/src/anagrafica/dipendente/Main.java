package anagrafica.dipendente;

import java.util.Scanner;

public class Main{
	private static Scanner scanner;

	private static Dipendente[] dipendenti = new Dipendente[5];
	
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
			if("n".equals(s)) {
				System.out.println("Hai Inserito "+len+" Persona/e");
				printMsg();
				continue;
			}
			if("l".equals(s)) {
				for(int p=0;p<len;p++) {
				Dipendente dipendente = dipendenti[p];	
					dipendente.printFullDetails();
				}
				printMsg();
				continue;
			}
			if(len>=5) {
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
			
			System.out.println("Azienda:");
			String azienda=scanner.nextLine();
			
			System.out.println("Grazie per i dati inseriti.");
			Dipendente dipendente = new Dipendente(nome, cognome, codiceFiscale, azienda);
			dipendenti[len++] = dipendente;
	
			dipendente.printFullDetails();
			printMsg();
			}
		}
	}
	
	public static void printMsg() {
		System.out.println("Premi: ");
		System.out.println(" - Q Per Uscire ");
		System.out.println(" - N Per Sapere Il Numero delle Persone Inserite");
		System.out.println(" - L Per Leggere La Lista dei Dati Delle Persone Inserite");
		System.out.println(" - I Per Inserire Un Nuova Per Inserire Nuove Persone");
	}
	
	

}
