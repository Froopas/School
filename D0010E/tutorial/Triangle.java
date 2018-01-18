package tutorial;

public class Triangle {
	static double triangleArea(int a,int b,int c) {
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	public static void main(String[] args) {
		System.out.println(triangleArea(2,2,2));
		
	}
}
