package tutorial;

public class Rovarsprak {
	static String robberTranslate(String s) {
		if(s.length()==0) {
			return "";
		} else {
			if(isConsonant(s.charAt(0))) {
				return s.charAt(0)+"o"+s.charAt(0)+robberTranslate(s.substring(1, s.length()));
			} else {
				return s.charAt(0)+robberTranslate(s.substring(1,s.length()));
			}
		}
	}
	
	static boolean isConsonant(char c) {
		String s="bcdfghjklmnpqrstvwxz";
		s+=s.toUpperCase();
		if(s.indexOf(c)==-1){
			return false;
		} else {
			return true;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(robberTranslate("pannkakor"));
	}
}
