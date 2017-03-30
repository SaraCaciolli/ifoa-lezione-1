package centralino;

import java.util.Date;

public class Cliente {
	String nome;
	Date arrivo;
	Date accettazione;
	
	public String getNome() {
		return nome;
	}
	
	public Date getArrivo() {
		return arrivo;
	}
	public void setArrivo(Date arrivo) {
		this.arrivo = arrivo;
	}
	public Date getAccettazione() {
		return accettazione;
	}
	public void setAccettazione(Date accettazione) {
		this.accettazione = accettazione;
	}
	
	public Cliente(String nome, Date arrivo) {
		super();
		this.nome = nome;
		this.arrivo = arrivo;
	}
	
	@Override
	public String toString(){
		return "Cliente " + nome ;
	}

}
