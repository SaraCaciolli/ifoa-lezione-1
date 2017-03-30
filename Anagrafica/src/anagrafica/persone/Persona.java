package anagrafica.persone;

public class Persona {
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
		System.out.println("- - - - - - - - - - - ");
		System.out.println("Nome: "+ nome);
		System.out.println("Cognome: "+ cognome);
		System.out.println("Codice Fiscale: "+ codiceFiscale);
		System.out.println("- - - - - - - - - - - ");
	}
	
	@Override
	public String toString() {
		return " "+this.nome+" "+this.cognome;
	}
}
		




