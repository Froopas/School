package Fberedupp;

public class U4D {
	public static int shortS(int n) {
		if(n<=0)return 841;
		return longS(n-1)/2;
	}
	public static int longS(int n) {
		if(n<=0)return 1189;
		return shortS(n-1);
	}
	public static void main(String[] args) {
		System.out.println(shortS(4));
		System.out.println(longS(4));
	}
}
