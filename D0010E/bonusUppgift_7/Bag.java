package bonusUppgift_7;
/** Egneric class Bag that contains Generic type and implements the interface weighable
 * 
 * @author Anton Johansson D0010E
 *
 */

public class Bag<E> implements Weighable {
	private E content;
	private int weight;
	Bag(){
		this.content=null;
		this.weight=0;
	}
	
	public void fillBagWith(E content,int weight) {
		this.content=content;
		this.weight=weight;
	}
	
	public Pair<E,Integer> emptyBag(){
		Pair<E,Integer> drop=new Pair<E,Integer>(this.content, new Integer(this.weight));
		this.content=null;
		this.weight=0;
		return drop;
	}
	
	public int weight() {
		return this.weight;
	}
	

	public static void main(String[] args) {
		Bag<Double> d=new Bag<Double>();
		d.fillBagWith(new Double(Math.PI), 3);
		System.out.println(d.weight());
		System.out.println(d.emptyBag().toString());
		System.out.println(d.weight());
		System.out.println(d.emptyBag().toString());
	
	}
	
}

interface Weighable{
	public int weight();
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