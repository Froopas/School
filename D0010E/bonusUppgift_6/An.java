package bonusUppgift_6;

/**
 * 
 * @author Anton Johansson
 *
 */

public class An {

	public static void main(String[] args) {
		//välj vilken dimension som ska kollas
		int dimension_to_check=9;
		System.out.println("width x Height (mm) \n  "+a(dimension_to_check).toString());

	}
	public static Pair<Integer,Integer >a(int n){
		//return ett nytt objekt Pair med variabeler kortSida från An och långSida från An
		return new Pair<Integer,Integer>(new Integer(shortS(n)),new Integer(longS(n)));
	}
	
	public static int shortS(int n) {
		//returnerar kortsida av An
		if(n<=0)return 841;
		return longS(n-1)/2;
	}
	public static int longS(int n) {
		//returnerar långsida av An
		if(n<=0)return 1189;
		return shortS(n-1);
	}
}

class Pair<A,B>{
	private A a;
	private B b;
	Pair(A a,B b){
		this.a=a;
		this.b=b;
	}
	Pair(){
		a=null;
		b=null;
	}
	
	A frst(){
		return a;
	}
	
	B scnd() {
		return b;
	}
	
	public String toString(){
		return ("("+frst()+","+scnd()+")");
	}
}
