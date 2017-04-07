package verifica.gestione.utenti;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	private static List<Persona> listaPersone = new ArrayList<Persona>();

	public static void main(String[] args) throws IOException {
		String percorso = "C:\\Users\\admin\\Documents\\EsercitazioniJava\\LISTA_dos.txt";
		System.out.println("BENVENUTO");
		stampaMenu();
		scanner = new Scanner(System.in);
		listaPersone = Files.LeggiFile(percorso);
		while (scanner.hasNext()) {
			String s = scanner.nextLine();

			if ("q".equals(s) || "Q".equals(s)) {
				System.err.println("Ciao Ciao Alla Prossima");
			}
			if ("h".equals(s) || "H".equals(s)) {
				stampaMenu();
			}
			if ("1".equals(s)) {
				System.out.println("Numero Persone: " + listaPersone.size());
			}
			if ("2".equals(s)) {
				int emailsbagliata = 0;
				for (int i = 0; i < listaPersone.size(); i++) {
					Persona p = listaPersone.get(i);
					if (!p.isEmailvalida()) {
						emailsbagliata++;
					}
				}
				System.out.println("il numero di Email sbagliate sono: " + emailsbagliata);
			}

			if ("3".equals(s)) {
				System.out.println("LE EMAIL ERRATE SONO: ");
				for (int i = 0; i < listaPersone.size(); i++) {
					Persona p = listaPersone.get(i);
					if (!p.isEmailvalida()) {
						System.out.println(p.getEmail());
					}
				}
			}
			if ("4".equals(s)) {
				HashMap<String, Integer> freq = new HashMap<String, Integer>();

				for (Persona p : listaPersone) {
					String key = p.getNome();
					Integer prev = freq.get(key);
					if (prev == null) {
						prev = 1;
					} else {
						prev++;
					}
					freq.put(key, prev);
				}
				int maxfreq = 0;
				for (String key : freq.keySet()) {
					Integer valoreCorrente = freq.get(key);
					if (valoreCorrente > maxfreq) {
						maxfreq = valoreCorrente;
					}
				}
				System.out.println("il numero massimo di volte che un nome è ripetuto e: " + maxfreq);
				for (String key : freq.keySet()) {
					Integer valoreCorrente = freq.get(key);
					if (valoreCorrente == maxfreq) {
						System.out.println("Il nome più ripetuto è: " + key);
					}
				}
			}

			if ("5".equals(s)) {
				HashMap<String, Integer> freqP = new HashMap<String, Integer>();
				for (Persona p : listaPersone) {
					String key = p.getTelefono().split(" ")[0].trim();
					Integer pref = freqP.get(key);
					if (pref == null) {
						pref = 1;
					} else {
						pref++;
					}
					freqP.put(key, pref);
				}
				System.out.println("I Prefissi ripetuti sono: ");
				for (String key : freqP.keySet()) {
					Integer valore = freqP.get(key);
					if (valore > 1) {
						System.out.println(key + "ripetuto " + valore + " volte");
					}
				}
			}
			if ("6".equals(s)) {
				System.out.println("Il numero degli utenti maggiorenni è: " + (Persona.Maggiorenni(listaPersone)));
			}
		}
	}

	public static void stampaMenu() {
		System.out.println("---------MENU---------");
		System.out.println("PREMI:");
		System.out.println("- Q - per Uscire");
		System.out.println("- H - per Visualizzare Il Menù");
		System.out.println("- 1 - per Leggere il File");
		System.out.println("- 2 - per Visualizzare il Numero di Utenti con Email Errata");
		System.out.println("- 3 - per Visualizzare le Email Errate");
		System.out.println("- 4 - per Visualizzare il Numero di Utenti il cui Nome ricorre più volte");
		System.out.println("- 5 - per Visualizzare i Prefissi Telefonici che si Ripetono più di una volta");
		System.out.println("- 6 - per Visualizzare il Numero di Utenti Maggiorenni");
	}
}
