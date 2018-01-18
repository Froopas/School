package tutorial;

public class Saw {
	
	static void triangle(int l) {
		for(int i=1;i<=l;i++) {
			for (int j=0;j<i-1;j++) {
				System.out.print("*");
			}
			System.out.println("-");
		}
	}
	
	static void sawtooth(int a,int b) {
		for(int i=0;i<b;i++) {
			triangle(a);
		}
	}
	
	public static void main(String[] args) {
		triangle(4);
		sawtooth(3,2);

	}

}
