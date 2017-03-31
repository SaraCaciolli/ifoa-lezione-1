package mappa.parole;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class MyCollections {

	public static void main(String[] args)throws IOException {
		String filename = new String("C:\\Users\\admin\\Documents\\EsercitazioniJava\\Sara\\Sara.txt");
		File file = new File(filename);
		FileReader reader = null;
		BufferedReader in = null;
		Map <String,Integer> mappa = new HashMap<>();
		
		try{
			reader = new FileReader(file);
			in = new BufferedReader(reader);
			if (reader != null && in !=null){
			String linea = in.readLine();
				while(linea != null){
					String[] parole = linea.split(" "); //fare una regular expression che gestisca i sengi di punteggiatura
					
					for(int i=0;i<parole.length;i++){
						String parola=parole[i]; 
						Integer valore = mappa.get(parola);
						if(valore==null){
							valore = 1;
						}else {
							valore++;
						}
						mappa.put(parola, valore);
					}
					linea = in.readLine();
				}
				System.out.println("Size: "+mappa.size());
				for (String key:mappa.keySet()){
					Integer valore = mappa.get(key);
					System.out.println(key + " ha " + valore+" occorrenza");
				}
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} finally {
			if (reader != null)
			{
				reader.close();
			}
			if (in != null){
				in.close();
			}
		}
	}
}
