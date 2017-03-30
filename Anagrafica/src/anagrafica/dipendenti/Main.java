package anagrafica.dipendenti;

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
			if("q".equals(s) || "Q".equals(s)) {
				System.err.println("Ciao Ciao Alla Prossima");
			}
			if("n".equals(s) || "N".equals(s)) {
				if (len == 1){
				System.err.println("Hai Inserito "+len+" Dipendente");
				printMsg();	
				continue;
				} else {
					System.err.println("Hai Inserito "+len+" Dipendenti");
					printMsg();	
					continue;
				}
			}
			if("l".equals(s) || "L".equals(s)) {
				if (len == 0){
					System.err.println("Non ci Sono Dipendenti Inseriti");
				}
				for(int p=0;p<len;p++) {
				Dipendente dipendente = dipendenti[p];	
					dipendente.printFullDetails();
				}
				printMsg();
				continue;
			}
			if(len>=5) {
				System.err.println("Non Puoi Inserire Altri Dipendenti.");
				printMsg();
				continue;
			}
			if("i".equals(s) || "I".equals(s)){
				System.out.println("PREMI:");
				System.out.println("- 1 Per Inserire Un Dipendente dell'Azienda1");
				System.out.println("- 2 Per Inserire Un Dipendente dell'Azienda2");
				 String num = scanner.nextLine();
				 if ("1".equals(num)){
				
					 System.out.println("INSERISCI I SEGUENTI DATI.");

					 System.out.println("NOME");
					 String nome=scanner.nextLine();
				
					 System.out.println("COGNOME:");
					 String cognome=scanner.nextLine();
		
					 System.out.println("CODICE FISCALE:");
					 String codiceFiscale=scanner.nextLine();
			
					 System.out.println("AZIENDA:");
					 String azienda="Azienda1";
					
					 System.out.println("GRAZIE PER I DATI INSERITI.");
					 Dipendente1 dipendente = new Dipendente1(nome,cognome,codiceFiscale,azienda);
					 dipendenti[len++] = dipendente;
					 dipendente.printFullDetails();
					
				}else if ("2".equals(num)){
					 System.out.println("INSERISCI I SEGUENTI DATI.");

					 System.out.println("NOME");
					 String nome=scanner.nextLine();
				
					 System.out.println("COGNOME:");
					 String cognome=scanner.nextLine();
		
					 System.out.println("CODICE FISCALE:");
					 String codiceFiscale=scanner.nextLine();
					 if (Persona.verificaCodiceFiscale(codiceFiscale))
					 {
						 System.out.println("AZIENDA:");
							String azienda="Azienda2";
							
							System.out.println("GRAZIE PER I DATI INSERITI.");
							Dipendente2 dipendente = new Dipendente2(nome, cognome, codiceFiscale, azienda);
							dipendenti[len++] = dipendente;
							dipendente.printFullDetails();
					 } else {
						 codiceFiscale=scanner.nextLine();
					 }
					
				}else {
					System.err.println("Devi Premere 1 o 2 per scegliere l'azienda");
				}
			
			printMsg();
			}
		}
	}
	
	public static void printMsg() {
		System.out.println("PREMI: ");
		System.out.println(" - Q Per Uscire ");
		System.out.println(" - N Per Sapere Il Numero dei Dipendenti Inseriti");
		System.out.println(" - L Per Leggere La Lista dei Dipendenti Inseriti Con i Loro Dettagli");
		System.out.println(" - I Per Inserire Un Nuova Per Inserire Nuovi Dipendenti");
	}

		

}
