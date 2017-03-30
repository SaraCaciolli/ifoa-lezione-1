package inserici.file;

import java.io.File;

public class EsploraRicorsiva {
		public static void main(String[] args) {
			String percorso = "C:\\Users\\admin\\Documents\\EsercitazioniJava\\Sara";		
			System.out.println(percorso);
			Esplora(percorso);		
		}
		
//		public static String spazio = " ";
		
		public static void Esplora(String dir){
//			spazio += " ";
			File directory = new File(dir);
			String[] list = directory.list();
			for (int i = 0; i<list.length; i++) {			
				File f = new File(dir, list[i]);
				if (f.isFile()){
					System.out.println((i+1) + " : " + list[i]);
				}
				else if (f.isDirectory()){
					System.out.println(f.getPath());
					Esplora(f.getPath());
				}
			}
		}
}

