package anagrafica.dipendenti;

public abstract class Dipendente extends Persona {

	protected String azienda;
	protected String matricola;
 

	public String getAzienda() {
		return azienda;
	}
	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}
	
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.azienda = matricola;
	}
	
	public Dipendente(String nome, String cognome, String codiceFiscale,  String azienda) {
		super(nome, cognome, codiceFiscale);
		this.azienda = azienda;
	}
	
	public void printFullDetails() {
		System.out.println("- - - - - - - - - - - - - - - ");
		String n = "NOME:";
		String g = "COGNOME:";
		String cf = "CODICE FISCALE:";
		String a = "AZIENDA:";
		String m = "MATRICOLA:";		
		System.out.format("%-15s %s\r\n",n, nome); 

		System.out.format("%-15s %s\r\n",g, cognome);

		System.out.format("%-15s %s\r\n",cf, codiceFiscale);

		System.out.format("%-15s %s\r\n",a, azienda);

		System.out.format("%-15s %s\r\n",m, matricola);

		System.out.println("- - - - - - - - - - - ");
	}
	
}


	

