package Fberedupp;

public class F2A {
	public static int kvadratRekursiv(int k) {
		if (k<=1) {
			return 1;
		} else {
			return kvadratRekursiv(k-1)+k+k-1;
		}
	}

	public static void main(String[] args) {
		System.out.println(kvadratRekursiv(5));
	}

}
