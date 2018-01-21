package BonusUppgift_2;

public class Helicopter {
	private String callSign = "";
	private long rtX = 0L, rtY = 0L;
	private double distanceFlown = 0.0d;
	private boolean m_LightOn; //Variable to Determine of the lights are on or off

	public Helicopter(String name) {
		callSign = name;
		m_LightOn=false;
	}

	public void flyTo(long x, long y) {
		double dx = Math.abs(x - rtX);
		double dy = Math.abs(y - rtY);
		distanceFlown += 
			Math.sqrt(dx * dx + dy * dy);
		rtX = x;
		rtY = y;
	}
	
	public void turnOn() {
		m_LightOn=true;
	}
	
	public void turnOff() {
		m_LightOn=false;
	}

	public String callSign() {
		return callSign;
	}
	
	public long getX() {
		return rtX;
	}

	public long getY() {
		return rtY;
	}

	public double distanceFlown() {
		return distanceFlown;
	}
	
	public boolean lightIsOn() {
		return m_LightOn;
	}
}
