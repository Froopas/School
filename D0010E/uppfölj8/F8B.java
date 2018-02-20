package uppfölj8;

public class F8B {

	public static void main(String[] args) {
		Nat man=new Nat(25);
		System.out.println(fibonacci(man));
		System.out.println(factorial(man));

	}
	
	public static Nat fibonacci(Nat n) {
		long prev1=1;
		long prev2=0;
		long result=1;
		for(int i=2;i<=n.toInt();i++) {
			result=prev1+prev2;
			prev2=prev1;
			prev1=result;
		}
		return (new Nat((int)result));
	}
	public static Nat factorial(Nat n) {
		Nat result=new Nat(1);
		for(int i=1;i<=n.toInt();i++) {
			result=result.mul(new Nat(i));
		}
		return result;
	}
}

class Nat {
	private long unsigned;

	public Nat(int n) {
		if (n < 0)
			throw new IllegalArgumentException();
		this.unsigned = (long)n;
	}
	
	public Nat add(Nat n) {
		this.unsigned+=n.toInt();
		return this;
	}
	
	public long toInt() {
		return this.unsigned;
	}
	
	public Nat mul(Nat n) {
		this.unsigned*=n.toInt();
		return this;
	}
	
	public Nat sub(Nat n) {
		if(this.unsigned<n.toInt())
			throw new IllegalArgumentException();
		this.unsigned-=n.toInt();
		return this;
	}
	 public String toString() {
		 return ("("+this.unsigned+")");
	 }
}