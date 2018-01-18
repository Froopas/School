package tutorial;

public class gcd {
	static void gcdiv(int a, int b) {
		int c;
		do {
			c=a%b;
			a=b;
			b=c;
		}while(c!=0);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		gcdiv(100,40);
	}
}
