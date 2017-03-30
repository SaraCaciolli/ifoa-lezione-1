package Email;

import java.util.regex.Pattern;

public class Email {
	
	public static void main (String []args){
		CharSequence cs = " ";
		if(TrovaEmail(cs)){
			System.out.println("vero");
		}else{
			System.err.println("falso");
		}
	}
	
	static boolean checkEmail(CharSequence email){
		//String regex = "^[A-Za-z0-9.-_]+@[A-Za-z0-9.-_]+\\.[a-z]{2,6}?$";
				String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
				if(Pattern.matches(regex, email)){
					return true;
				}else{
					return false;
				}
	}
	
	static boolean TrovaEmail(CharSequence email){
		//String regex = "^[A-Za-z0-9.-_]+@[A-Za-z0-9.-_]+\\.[a-z]{2,6}?$";
				String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
				if(Pattern.matches(regex, email)){
					return true;
				}else{
					return false;
				}
	}
}

