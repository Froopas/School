package bonusUppgift_5;

/** Class that makes a dynamic object, "water bottle".
 * 
 * @author Anton Johansson
 *
 */

public class Vattenflaska {
	private String ägare;
	private int kapacitet;
	private int volym;

	// ägare specificerar ägaren av flaskan, kapacitet specificerer den totala volym som flaskan kan fyllas. 
	public Vattenflaska(String ägare, int kapacitet) {
		this.ägare=ägare;
		this.kapacitet=kapacitet;
	}
	
	//returnerar kapaciteten
	public int kapacitet() {
		return kapacitet;
	}
	//returnerar det nuvarande innehållet
	public int innehåll() {
		return volym;
	}
	//ändrar den dynamiska variabeln volym med önskat värde, 
	//om nya värdet överskrider kapaciteten tilldelas volym kapacitet.
	public void fyllPå(int mängd) {
		if(mängd>0)
			volym=volym+mängd<kapacitet ? volym+mängd:kapacitet;
	}
	//ändrar den dynamiska variablen volym med önskat värde, om nya värdet är mindre än 0 tilldelas volym 0.
	public void tömUt(int mängd) {
		if(mängd>0)
			volym=(mängd>volym||mängd<0) ? 0:volym-mängd;
	}
	//returnerar en fixerad sträng med ägare, kapacitet och nuvarande volym.
	public String toString() {
		return ägare+"s flaska kan innehålla max "+kapacitet+" ml och innehåller nu "+volym+" ml";
	}
	
	public static void main(String[] args) {
		Vattenflaska vatten=new Vattenflaska("Greger",10000);
		System.out.println(vatten.toString());
		System.out.println(vatten.kapacitet());
		vatten.fyllPå(-1000);
		System.out.println(vatten.toString());
		vatten.tömUt(500000);
		System.out.println(vatten.toString());
		vatten.fyllPå(1000);
		System.out.println(vatten.toString());
		vatten.tömUt(60);
		System.out.println(vatten.toString());
		vatten.tömUt(40);
		System.out.println(vatten.toString());
		
	}

}
