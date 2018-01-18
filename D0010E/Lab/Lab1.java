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
		while(a0!=1){
			a0=f1(a0);
			length++;
		}
		return length;
	}
	public static int recLifelength(int a0) {
		if (a0==1) {
			return 0;
		} else if(a0%2==0) {
			return 1+recLifelength(a0/2);
		} else {
			return 1+recLifelength(3*a0+1);
		}
	}
	//l(x)=l(f(x))+1
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			System.out.print(f1(Integer.parseInt(args[i])));/*Task 1*/
			System.out.print("java lifelength for "+args[i]+"\n"+
							"f1="+f1(Integer.parseInt(args[i]))+"\t"+
							"f2="+f2(Integer.parseInt(args[i]))+"\t"+
							"f4="+f4(Integer.parseInt(args[i]))+"\t"+
							"f8="+f8(Integer.parseInt(args[i]))+"\t"+
							"f16="+f16(Integer.parseInt(args[i]))+"\t"+
							"f32="+f32(Integer.parseInt(args[i]))+"\t"
			  );/*Task 2*/
			System.out.print(iterateF(Integer.parseInt(args[i]),4)); /*Task 3*/
			System.out.print(iterLifelength(Integer.parseInt(args[i])));/*Task 4*/
		}
		System.out.println("Iter\trec");
		for(int i=1;i<16;i++) {
			System.out.println(iterLifelength(i)+"\t"+recLifelength(i));
		}
		
	}

}
