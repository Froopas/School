package BonusUppgifter;

public class Temp {
	
	public static double f2c(double f) {
		return (f-32)*5/9;
	}

	public static void main(String[] args) {
		for (int i=40;i>=-40;i-=5) {
			double x=java.lang.Math.rint(f2c(i)*10.0d)/10.0d;
			System.out.println(i+"\u00B0f is "+x+"\u00B0c");
		}
	}

}
