package Fberedupp.egg;

public class Egg {
	private boolean food;
	private String m_country;
	private int m_method;
	private int m_facility;
	
	Egg(int method, String country, int fac){
		m_method=method;
		m_country=country;
		m_facility=fac;
		food=true;
	}
	public int getMet() {
		return m_method;
	}
	public String getCountry() {
		return m_country;
	}
	public int getfac() {
		return m_facility;
	}
	public boolean isFood() {
		return food;
	}
	public void foodBad() {
		food=false;
	}
	
}
