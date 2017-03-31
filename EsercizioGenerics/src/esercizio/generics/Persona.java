package esercizio.generics;

public class Persona implements PrintInterface{
	String nome;
	String cognome;
	String codiceFiscale;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	public Persona(String nome, String cognome, String codiceFiscale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}
	
	public void setCf(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
		
	}
	//
	public void printFullDetails() {
		System.out.println("- - - - - - - - - - - - - - - ");
		String n = "NOME:";
		String g = "COGNOME:";
		String cf = "CODICE FISCALE:";		
		System.out.format("%-15s %s\r\n",n, nome); 
		System.out.format("%-15s %s\r\n",g, cognome);
		System.out.format("%-15s %s\r\n",cf, codiceFiscale);
		System.out.println("- - - - - - - - - - - ");
	}
	
	@Override
	public String toString() {
		return " "+this.nome+" "+this.cognome;
	}

	
	@Override
	public void stampaDetails() {
		printFullDetails();
		
	}
}
		




