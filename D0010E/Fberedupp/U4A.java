package Fberedupp;

public class U4A {
	public static int max(int[] a) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			max=F4A.max(max,a[i]);
		}
		return max;
	}
}
