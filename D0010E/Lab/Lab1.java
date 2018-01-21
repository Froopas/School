package Lab;

public class Lab1 {
	public static int f1(int a0) {
		if(a0==1) {
			return 1;
		}
		if(a0%2==0) {
			return a0/2;
		}else {
			return 3*a0+1;
		}
	}
	public static int f2(int a0) {
		return f1(f1(a0));
	}
	public static int f4(int a0) {
		return f2(f2(a0));
	}
	public static int f8(int a0) {
		return f4(f4(a0));
	}
	public static int f16(int a0) {
		return f8(f8(a0));
	}
	public static int f32(int a0) {
		return f16(f16(a0));
	}
	public static int iterateF(int a0,int n) {
		for(int i=0;i<n;i++) {
			a0=f1(a0);
		}
		return a0;
	}
	public static int iterLifelength(int a0) {
		int length=0;
		while(a0>1){
			a0=f1(a0);
			length++;
		}
		return length;
	}
	public static int recLifelength(int a0) {
		if (a0<=1) {
			return 0;
		} else if(a0%2==0) {
			return 1+recLifelength(a0/2);
		} else {
			return 1+recLifelength(3*a0+1);
		}
	}
	//l(x)=l(f(x))+1
	public static void tryTask1_6(String[] args) {
		for(int i=0;i<args.length;i++) {
			System.out.println("Current variable = "+args[i]);
			System.out.println("Task1\t"+Task1(args[i]));/*Task 1*/
			System.out.println("Task2\t"+Task2(args[i]));/*Task 2*/
			System.out.println("Task3\t"+Task3(args[i])); /*Task 3*/
			System.out.println("Task4\t"+Task4(args[i]));/*Task 4*/
		}
		System.out.print(Task6());
	}
	public static int Task1(String argument) {
		return f1(Integer.parseInt(argument));
	}
	public static String Task2(String argument) {
		return "java lifelength for "+argument+"\n"+
				"f1="+f1(Integer.parseInt(argument))+"\t"+
				"f2="+f2(Integer.parseInt(argument))+"\t"+
				"f4="+f4(Integer.parseInt(argument))+"\t"+
				"f8="+f8(Integer.parseInt(argument))+"\t"+
				"f16="+f16(Integer.parseInt(argument))+"\t"+
				"f32="+f32(Integer.parseInt(argument))+"\t";
	}
	public static int Task3(String argument) {
		return iterateF(Integer.parseInt(argument),4);
	}
	public static int Task4(String argument) {
		return iterLifelength(Integer.parseInt(argument));
	}
	public static String Task6() {
		String outputs="Iter\trec\n";
		for (int i=0;i<16;i++) {
			outputs+=iterLifelength(i)+"\t"+recLifelength(i)+"\n";
		}
		return outputs;
	}
	public static void main(String[] args) {
		int n=5;
		String b="";
		do {
			//n=System.in.read(b,0,1000);
			switch(n) {
			case(1):{
				System.out.println("Using variable "+args[1]+"\n"+Task1(args[1]));
				break;
			}
			case(2):{
				System.out.println("Using variable "+args[1]+"\n"+Task2(args[1]));
				break;
			}
			case(3):{
				System.out.println("Using variable "+args[1]+"\n"+Task3(args[1]));
				break;
			}
			case(4):{
				System.out.println("Using variable "+args[1]+"\n"+Task4(args[1]));
				break;
			}
			case(6):{
				Task6();
				break;
			}
			case(16):{
				tryTask1_6(args);
				break;
			}
			default:{
				break;
			}
			}
		}while(n!=0);
		
	}

}
