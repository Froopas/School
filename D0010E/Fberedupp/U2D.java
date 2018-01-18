package Fberedupp;

public class U2D {
	public static void triangle(int n) {
		if(n>=1&&n<=61) {
			for(int i=1;i<=n;i++) {
				System.out.print(F2D.blanks(n-i));
				for(int j=1;j<i*2;j++) {
					System.out.print("*");
				}
				if(i!=n) {
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args) {
		triangle(61);

	}

}
