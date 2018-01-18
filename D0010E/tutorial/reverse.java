package tutorial;

public class reverse {
	static String reverseString(String s) {
		if(s.length()==0) {
			return "";
		}
		return(reverseString(s.substring(1,s.length()))+s.charAt(0));
	}
	public static void main(String[] args) {
		System.out.println(reverseString("Femtonhundra"));
	}
}
