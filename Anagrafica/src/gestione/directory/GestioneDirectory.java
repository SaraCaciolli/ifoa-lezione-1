package gestione.directory;


import java.util.Scanner;

public class GestioneDirectory {
	private static Scanner scanner;
	static String titoloLettura = "";
	static boolean letto = false;
	public static void main(String[] args) {
		
		System.out.println("Benvenuto");
		scanner = new Scanner(System.in);
		Menu();
		
		while(scanner.hasNext()) {
			String s = scanner.nextLine();
			String percorso = "C:\\Users\\admin\\Documents\\EsercitazioniJava\\Sara";
			if("q".equals(s) || "Q".equals(s)) {
				System.err.println("Ciao Ciao Alla Prossima");
			}
			if("h".equals(s) || "H".equals(s)){
				Menu();
			}
			if("v".equals(s) || "V".equals(s)){
				System.out.println(percorso);
				FunzioniEsplorazioni.EsploraTutto(percorso);
				
			}
			if("c".equals(s) || "C".equals(s)){	
				System.out.println(percorso);
				FunzioniEsplorazioni.EsploraCartelle(percorso);	
				
			}
			if("f".equals(s) || "F".equals(s)){	
				System.out.println(percorso);
				FunzioniEsplorazioni.EsploraFiles(percorso);	
				
			}
			if("d".equals(s) || "D".equals(s)){
				System.out.println(percorso);
				FunzioniEsplorazioni.EsploraDirectory(percorso);	
				
			}
			if("l".equals(s) || "L".equals(s)){
				System.out.println("Inserisci il titolo del file");
				titoloLettura=scanner.nextLine();
				
				try {
					letto = true;
					FunzioniEsplorazioni.LeggiFile(percorso,titoloLettura);
					System.out.println("Premi T Se vuoi continuare a leggere");
				} catch (Exception e) {
					System.err.println("il file non esiste");
				} 
			
			}
			if (("t".equals(s) || "T".equals(s)) && letto==true){ 
				try {
					FunzioniEsplorazioni.LeggiAncora(percorso,titoloLettura);
				} catch (Exception e) {
					System.err.println("il file non esiste");
					e.printStackTrace();
				} letto = false; 
				} 
			if ("s".equals(s) || "S".equals(s)){
				System.out.println("Inserisci il titolo del file su cui vuoi scrivere");
				String titoloScrittura=scanner.nextLine();
				System.out.println("Inserisci il testo del documento");
				String testo=scanner.nextLine();
				try {
					FunzioniEsplorazioni.ScriviFile(percorso,titoloScrittura,testo);
					
				} catch (Exception e) {
					System.out.println("Inserisci il titolo del file");
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void Menu() {
		System.out.println("PREMI: ");
		System.out.println(" - Q Per Uscire ");
		System.out.println(" - H Per Vedere il Menù ");
		System.out.println(" - V Per Visualizza La Lista Completa (Files e Cartelle)");
		System.out.println(" - C Per Visualizza La Lista delle Cartelle e SottoCartelle");
		System.out.println(" - F Per Visualizza La Lista dei Files (anche quelli delle sotto cartelle)");
		System.out.println(" - D Per Visualizza Solo In Questa Directory");
		System.out.println(" - L Per Leggere Le Prime Righe Di Un File");
		System.out.println(" - S Per Creare Un Nuovo File");
		
	}
}
	
