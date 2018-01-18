package tutorial;

public class Relation {
	static boolean isThreeEqual(int a,int b,int c) {
		if(!(a!=b||b!=c)) {
			return true;
		}
		return false;
	}
	
	static boolean isTwoEqual(int a, int b) {
		return !(a!=b);
	}
	
	public static void main(String[] args) {
		System.out.print(isThreeEqual(1,1,1));
		System.out.print(isThreeEqual(2,1,1));
		System.out.print(isTwoEqual(1,1));
		System.out.print(isTwoEqual(2,1));
	}

}
