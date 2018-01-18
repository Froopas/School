package Fberedupp;

public class U2A {
	public static int kvadratIterativ(int k) {
		int s=0;
		for(int i=k;i>0;i--) {
			s=s+i+i-1;
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println(kvadratIterativ(12));
	}
}
