package bonusuppgift_8;
/**	Static class to evaluate a String of integers and return an integer array
 * 
 * @author Anton Johansson D0010E
 */

import java.util.ArrayList;
import java.util.Scanner;

public class String2intArray {

	public static int[] str2ia(String s) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		Scanner scanner = new Scanner(s);
		scanner.useDelimiter(" *, *"); // changes where canner splits
		while (scanner.hasNext()) {
			int temp;
			try {
				if (s.startsWith(",")||s.startsWith(" ,")||s.endsWith(",")||s.endsWith(", ")) // Checks if the string starts or ends with ,
					throw new Exception();
				temp = scanner.nextInt();
			} catch (Exception e) {
				scanner.close();
				throw new IllegalArgumentException();
			}
			output.add(new Integer(temp));
		}
		scanner.close();
		int[] returnvalue = new int[output.size()];
		for (int i = 0; i < output.size(); i++) {
			returnvalue[i] = output.get(i).intValue();
		}
		return returnvalue;

	}

	public static void main(String[] args) {
		int[] hej = str2ia("1,23,2,1,5,12,5,125,1,25,12,5,15,5,2123,2,2");
		for (int i : hej) {
			System.out.print(i+" ");
		}
		System.out.println("\n" + hej.length);
	}

}
