package verifica.gestione.utenti;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.regex.Pattern;

public class Persona {
	String nome;
	String cognome;
	String email;
	Boolean emailvalida;
	String dataNascita;
	String telefono;
	String indirizzo;

	public Persona(String nome, String cognome, String email, String dataNascita, String telefono, String indirizzo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.emailvalida = ValidaEmail(this.email);
		this.dataNascita = dataNascita;
		this.telefono = telefono;
		this.indirizzo = indirizzo;
	}

	public Boolean isEmailvalida() {
		return emailvalida;
	}

	public void setEmailvalida(Boolean emailvalida) {
		this.emailvalida = emailvalida;
	}

	public Persona() {
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public static boolean ValidaEmail(CharSequence email) {
		String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
		if (Pattern.matches(regex, email)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isMaggiorenne() {
		LocalDate oggi = LocalDate.now();
		String[] parts = dataNascita.split("/");
		LocalDate nascita = LocalDate.of(Integer.valueOf(parts[2]), Integer.valueOf(parts[1]),
				Integer.valueOf(parts[0]));

		Period intervalPeriod = Period.between(nascita, oggi);

		return intervalPeriod.getYears() >= 18;
	}

	public static int Maggiorenni(List<Persona> persone) throws IOException {
		int mag = 0;
		for (int i = 0; i < persone.size(); i++) {
			Persona p = persone.get(i);
			if (p.isMaggiorenne()) {
				mag++;
			}
		}
		return mag;
	}
}
