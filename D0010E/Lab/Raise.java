package Lab;

public class Raise {
	public static double recRaiseHalf(double x,int k, int c) {
		if(k==0) {
			System.out.print("Recursion call Half: "+c+"\t\t");
			return 1.0;
		}
		double res=recRaiseHalf(x,k/2,c+1);
		if(k%2==0) {
			return res*res;
		}
		return x*res*res;
	}
	
	public static double recRaiseOne(double x, int k, int c) {
		if(k==0) {
			System.out.print("Recursion call One : "+c+"\t");
			return 1.0;
		}
		return x*recRaiseOne(x,k-1,c+1);
	}

	public static void main(String[] args) {
		double x=1.0001;
		for(int i=1;i<=8000;i+=1) {
			System.out.println("Result One : "+recRaiseOne(x,i,0));
			System.out.println("Result of Half when k = "+i+" : "+recRaiseHalf(x,i,0)+"\n");
		}
	}
}
/*Notes:
 * The k is the one factoring to the runtime the most, Higher x can factor in since the computer can only calculate some x
 *  N_one=k is a Linear function.
 *  N_Half=floor(log_2(k))+1 , N_Half(0)=1;
 */