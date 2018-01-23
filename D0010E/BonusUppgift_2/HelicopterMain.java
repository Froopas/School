package BonusUppgift_2;

/** Anton Johansson TCDAA D0010E
 * 
 * */

public class HelicopterMain {
	public static Helicopter h = new Helicopter("Z 41");

	public static void main(String[] args) {
		h.flyTo(65, 40);
		h.flyTo(-43, 74);
		System.out.println(h.callSign() 
							+ " is at (" + h.getX() + "," 
							+ h.getY() + ") and has flown " 
							+ h.distanceFlown() + " km. "
							+ "The light is turned on: "+ h.lightIsOn()
							);
	}
}
