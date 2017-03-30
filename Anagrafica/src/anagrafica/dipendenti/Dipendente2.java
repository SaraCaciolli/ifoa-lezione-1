package anagrafica.dipendenti;

import java.util.Random;

public class Dipendente2 extends Dipendente {
	

	public Dipendente2(String nome, String cognome, String codiceFiscale, String azienda) {
		super(nome, cognome, codiceFiscale, azienda);
		this.matricola = generaMatricola(nome, cognome);
	}

	public static String generaMatricola(String nome, String cognome){
		if (nome.length()>=3 && cognome.length()>=3){
		 String matricola = nome.substring(0, 3).toUpperCase() + cognome.substring(0,3).toUpperCase();
		 return matricola;
		}else {
			Random rnd1 = new Random();
			Random rnd2 = new Random();
			Random rnd3 = new Random();
			int num1 = rnd1.nextInt(10);
			int num2 = rnd2.nextInt(10); 
			int num3 = rnd3.nextInt(10); 
			 String matricola = nome.substring(0, 1).toUpperCase() + cognome.substring(0,1).toUpperCase() + num1 + num2 + num3;
			 return matricola;
		}
	}
}
