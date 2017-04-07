package verifica.gestione.utenti;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Files {
	static String percorso;


	public String getPercorso() {
		return percorso;
	}


	public static List<Persona> LeggiFile(String percorso) throws IOException {
		String linea = "";
		File f = new File(percorso);
		List<Persona> usersList = new ArrayList<>();
		if(f.exists()){
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);

			linea = br.readLine();

			while (linea != null) {
				String[] datiArr = linea.split("\\|");
				Persona p = creaPersona(datiArr);
				usersList.add(p);
				linea = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr != null)
				fr.close();
		}
		}else{
			System.err.println("Errore durante la lettura del file");
		}
		return usersList;
	}

	public static Persona creaPersona(String[] datiArr) {
		Persona p = new Persona(datiArr[0], datiArr[1], datiArr[2], datiArr[3], datiArr[4], datiArr[5]);
		return p;
	}
	
	
}
