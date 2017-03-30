package gestione.directory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FunzioniEsplorazioni {
      
      public static void ScriviFile(String dir, String tit, String testo) throws Exception{
    	  FileWriter writer = new FileWriter(dir +"//"+tit+".txt", true);
    	  PrintWriter pw = new PrintWriter(writer);
    	  pw.println(testo);
    
    	  pw.close();
          writer.close();
          System.out.println("Il File è stato scritto con successo");
      }
      
	public static void EsploraDirectory(String dir){
		File directory = new File(dir);
		String[] list = directory.list();
		int countf = 0;
		for(int i = 0; i<list.length; i++){
			File f = new File(dir,list[i]);
			if(f.isFile()){
				countf += 1;
				String file = list[i];
				if(countf == 1){
					System.out.println("Questi sono i FILE che ci sono:");
					System.out.println(file);
					
				}else{
					System.out.println(file);
				}
			}
		}
		System.out.println();
		int countd = 0;
		for (int i= 0; i<list.length; i++) {
			File f = new File(dir,list[i]);
			if (f.isDirectory()){
				String cartelle = list[i];
				countd += 1;
				if(countd == 1){
					System.out.println("Queste sono le DIRECTORY che ci sono:");
					System.out.println(cartelle);
				}else{
					System.out.println(cartelle);
				}
			}
		}
		
	}
	
	public static void EsploraCartelle(String dir){
		File directory = new File(dir);
		String[] list = directory.list();
		for (int i = 0; i<list.length; i++) {			
			File f = new File(dir, list[i]);
			if (f.isDirectory()){
				System.out.println(f.getPath());
				EsploraCartelle(f.getPath());
			}
		}
	}
	
	public static void EsploraFiles(String dir){
			File directory = new File(dir);
			String[] list = directory.list();
			for (int i = 0; i<list.length; i++) {			
				File f = new File(dir, list[i]);
				if (f.isFile()){
					System.out.println(list[i]);
				}
				else if (f.isDirectory()){
					EsploraFiles(f.getPath());
				}
			}
		}
	
	private static String contaBarre(String s) {
		String spazio="";
		for (int i = 0; i < s.length(); i++) {
			if (('\\') == (s.charAt(i))) {
				spazio+="  ";
			} else {
				continue;
			}
		}
		return spazio;
	}
	
	public static void LeggiFile(String dir, String tit) throws Exception{
		int count = 0;
		FileReader reader = new FileReader(dir +"//"+tit+".txt");
	
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		
		while(line != null && count<10 ){
			System.out.println(line);
			line=br.readLine();
			count += 1;
		}
		reader.close();
		}
	
public static void LeggiAncora(String dir, String tit) throws Exception{
		int count = 0;
		FileReader reader = new FileReader(dir +"//"+tit+".txt");
	
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		while(line != null){
			if(count<10){
		  line=br.readLine();
			count += 1;
		}if (count >=10){
			line=br.readLine();
			System.out.println(line);
			count += 1;
			}
		}
		reader.close();
		}
	
	public static void EsploraTutto(String dir) {
		String spazio = contaBarre(dir);
		File directory = new File(dir);
		if (directory != null && directory.exists()) {
			String[] list = directory.list();
			if (list != null) {
				for (int i = 0; i < list.length; i++) {
					File f = new File(dir, list[i]);
					if (f.exists()) {
						if (f.isFile()) {
							System.out.println(spazio + (i + 1) + " : " + list[i]);
						} else if (f.isDirectory()) {
							System.out.println(spazio + f.getPath());
							EsploraTutto(f.getPath());
						}
					}
				}
			}
		}
	}
}
