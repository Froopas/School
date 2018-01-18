package Fberedupp;

public class F2B {
	public static int siffersumma(int n) {
		if(n<10) {
			return n;
		} else {
			return n%10+siffersumma(n/10);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(siffersumma(12345));
	}
}
