package Fberedupp;

public class F2E {
	public static void change(int B,int tens,int fives, int ones) {
		int Belopp=0,tior=0,femmor=0,ettor=0;
		Belopp=B;
		tior=(Belopp/10);
		femmor=(Belopp%10)/5;
		ettor=(Belopp%10%5);
		if(tior>tens) {
			tior=tens;
			femmor=(Belopp-tens*10)/5;
		}
		if (femmor>fives) {
			femmor=fives;
			ettor=(Belopp-(tior*10)-(femmor*5));
		}
		if (ettor>ones) {
			System.out.println("Växlingen går ej");
		} else {
			System.out.println("Beloppet "+Belopp+"kr växlas till "+tior+" tiokronor, "+femmor+" femkronor, "+ettor+" enkronor");
		}
	}
	public static void main(String[] args) {
		change(36,2,1,100);
	}
}
