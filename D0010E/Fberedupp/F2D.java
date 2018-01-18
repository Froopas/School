package Fberedupp;

public class F2D {
	public static String blanks(int n) {
		String s="";
		for(int i=0;i<n;i++) {
			s+=" ";
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println("\""+blanks(10)+"\"");
	}

}
