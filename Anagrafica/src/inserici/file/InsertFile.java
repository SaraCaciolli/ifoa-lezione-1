package inserici.file;
import java.io.File;
//import java.util.Date;

public class InsertFile {
	public static void main(String[] args)
	{
	
//	 File f = new File("C:\\Users\\admin\\Documents\\EsercitazioniJava\\Prove\\a.txt");
//	 if (f.exists()) {
//		 System.out.println("Name " + f.getName());
//		 System.out.println("Absolute path " + f.getAbsolutePath());
//		 System.out.println("Is writable " + f.canWrite());
//		 System.out.println("Is readble " + f.canRead());
//		 System.out.println("Is file " + f.isFile());
//		 System.out.println("Is Directory " + f.isDirectory());
//		 System.out.println("Last Modified at " + new Date(f.lastModified()));
//		 System.out.println("Lenght " + f.length() + " bytes long ");
//	 	}
		
		
		File directory = new File("C:\\Users\\admin\\Documents\\EsercitazioniJava\\Prove");
		String[] list = directory.list();
		int countf = 0;
		for(int i = 0; i<list.length; i++){
			File f = new File("C:\\Users\\admin\\Documents\\EsercitazioniJava\\Prove",list[i]);
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
			File f = new File("C:\\Users\\admin\\Documents\\EsercitazioniJava\\Prove",list[i]);
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
	
}
