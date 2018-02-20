package uppfölj10;

import java.util.Arrays;

public class DerivePoly {
	public static double[] ddx(double[] c) {
		double returnvalue[]=new double[c.length-1];
		for(int i=c.length-1;i>=1;i--) {
			returnvalue[i-1]=c[i]*i;
		}
		return returnvalue;
	}
	public static void main(String[] args) {
		double[] hej=new double[] {7,4,-8,1,2};
		System.out.println(Arrays.toString(ddx(hej)));
	}
}
