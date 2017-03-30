package anagrafica.dipendenti;

import java.util.regex.Pattern;

public class Persona {
	protected String nome;
	protected String cognome;
	static String codiceFiscale;

	
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
		Persona.codiceFiscale = codiceFiscale;
	}
	
	public Persona(String nome, String cognome, String codiceFiscale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		Persona.codiceFiscale = codiceFiscale;
	}
	

    public static boolean verificaCodiceFiscale(String CF){
			
         String regex="[a-zA-Z]{6}[0-9]{2}[a-zA-Z]{2}[0-9][a-zA-Z][0-9]{3}[a-zA-Z]";
         if(Pattern.matches(regex, CF)){
        	 codiceFiscale = CF;
       return true; }
    		   return false; }
    				  
	
	@Override
	public String toString() {
		return " "+this.nome+" "+this.cognome;
	}
}
		




