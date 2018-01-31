package bonusUppgift_6;

public class An {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class Pair<A,B>{
		A a;
		B b;
		Pair(A a,B b){
			this.a=a;
			this.b=b;
		}
		
		A fst(){
			return a;
		}
		
		B snd() {
			return b;
		}
	}
}
