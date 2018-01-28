package Fberedupp;

public class F4B {
	public static void sägMjau1(int n) {
		for(int i=0;i<n;i++) {
			System.out.println("Mjau!");
		}
	}
	public static void sägMjau2(int n) {
		if(n>0) {
			sägMjau2(n-1);
			System.out.println("Mjau!");
		}
	}
}
