package anagrafica.dipendente;

public class Dipendente extends Persona {
	protected String matricola;
	protected String azienda;
 
 public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public String getAzienda() {
		return azienda;
	}
	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}
	
	public Dipendente(String nome, String cognome, String codiceFiscale, String azienda) {
		super(nome, cognome, codiceFiscale);
		this.matricola = generaMatricola(nome, cognome);
		this.azienda = azienda;
	}
	
	public void printFullDetails() {
		System.out.println("- - - - - - - - - - - ");
		System.out.println("Nome: "+ nome);
		System.out.println("Cognome: "+ cognome);
		System.out.println("Codice Fiscale: "+ codiceFiscale);
		System.out.println("Matricola: "+ matricola);
		System.out.println("Azienda: "+ azienda);
		System.out.println("- - - - - - - - - - - ");
	}
	
	 public static String generaMatricola(String nome, String cognome){
		
		 String matricola = nome.substring(0, 2).toUpperCase() + cognome.substring(0,2).toUpperCase() + (int)Math.random()*100;
		 return matricola;
		}
	
}


	

