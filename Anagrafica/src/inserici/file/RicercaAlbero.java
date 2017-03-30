package inserici.file;

import java.io.File;

public class RicercaAlbero {

	public static void main(String[] args) {
		String percorso = "C:\\Users\\admin\\Documents\\EsercitazioniJava\\Sara";
		System.out.println(percorso);
		Esplora(percorso);
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

	public static void Esplora(String dir) {
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
							Esplora(f.getPath());
						}
					}
				}
			}
		}
	}
}

