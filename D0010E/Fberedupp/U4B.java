package Fberedupp;

public class U4B {
	private static int max(int[] a, int idx) {
		if(idx==a.length-1) {
			return a[idx];
		}
		int mx=max(a,idx+1);
		return a[idx]>mx ? a[idx]:mx;
	}
	public static void main(String[] args) {
		int[] test= {123,312,3,12,45,125,348,4,6,57,56,7,23,42,341};
		System.out.println(max(test,0));
		System.out.println(sum(test,0));
	}
	private static int sum(int[] a,int idx) {
		if(a.length==0||idx==a.length) {
			return 0;
		}
		return sum(a,idx+1)+a[0];
	}
}
