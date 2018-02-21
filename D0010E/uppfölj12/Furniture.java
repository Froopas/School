package uppfölj12;

public class Furniture {

}

abstract class Förvaringsmöbel {
	protected int pris;
	protected double x = 0, y = 0;

	public void sättpris(int pris) {
		this.pris = pris;
	}

	public void flyttaTill(double x, double y) {
		this.x = x;
		this.y = y;
	}
}

class Skåp extends Förvaringsmöbel {
	private int dörr;

	Skåp(int dörrar) {
		this.dörr = dörrar > 0 ? dörrar : 1;
	}

	int antalDörrar() {
		return this.dörr;
	}
}

abstract class Väggskåp extends Skåp implements Väggmonterad {
	Väggskåp(int a) {
		super(a);
	}
}

interface Väggmonterad {
	double höjd();
}

class Byrå extends Förvaringsmöbel {
	private int lådor;

	Byrå(int lådor) {
		this.lådor = lådor;
	}

	int antalLådor() {
		return lådor;
	}
}

class StationärByrå extends Byrå {

	StationärByrå(int lådor) {
		super(lådor);
	}
}

class LitenByrå extends Byrå {

	LitenByrå(int pris) {
		super(2);
		this.pris = pris < 1000 ? pris : 1000;
	}
}