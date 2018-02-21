package bonusUppgift_13;

import java.util.Random;

/**
 * Generic Class that manipulates an array of type E
 * @author Anton Johansson
 *
 * @param <E> generic type
 */

public class Shuffled<E> {
	private static final int AMOUNT_OF_ARRAYSHUFFLES=5;
	private E[] array;
	private Random seed;
	
	/**
	 * Creates a Shuffled object with an array and seed
	 * @param arr the array that is to be manipulated
	 * @param seed the seed that the array should manipulate with
	 */
	Shuffled(E[] arr, long seed){
		this.array=arr;
		this.seed=new Random(seed);
	}
	
	/**
	 * Creates and return a shuffled array of the specified type
	 * @return a shuffled version of the array which is defined in the constructor
	 */
	public E[] next() {
		E[] resultvalue = array.clone();
		for(int i=resultvalue.length-1;i>=0;i--) {
			int rand=seed.nextInt(i+1);
			E temp= resultvalue[rand];
			resultvalue[rand]=resultvalue[i];
			resultvalue[i]=temp;
		}
		return resultvalue;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		Integer[] ia = new Integer[a.length];
		for (int i = 0; i < a.length; i++) {
			ia[i] = a[i];
		}
		
		Shuffled<Integer> shuffle=new Shuffled<Integer>(ia,System.currentTimeMillis());
		for(int j=1;j<=AMOUNT_OF_ARRAYSHUFFLES;j++) {
			System.out.println("**************Shuffle "+j+"***************");
			Integer[] ib=shuffle.next();
			for(int i=0;i<ib.length;i++) {
				System.out.println(ib[i]+"\t"+ia[i]);
			}
		}
		

	}

}
