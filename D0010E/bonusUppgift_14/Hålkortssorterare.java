package bonusUppgift_14;

import java.util.Arrays;
import java.util.LinkedList;

public class Hålkortssorterare {

	public static void sortera(int[] hög) {
		LinkedList<Integer>[] list = new LinkedList[10];
		for(int i=0;i<list.length;i++) {
			list[i]=new LinkedList<Integer>();
		}
		int high = hög[0];
		for (int i = 1; i < hög.length; i++) {
			high = hög[i] > high ? hög[1] : high;
		}
		String highnum = String.valueOf(high);
		for (int j = 0; j < highnum.length(); j++) {
			for (int i = 0; i < hög.length; i++) {
				list[hög[i] % ((int)Math.pow(10,j))].add(hög[i]);
			}
			int s=0;
			for(int k=0;k<list.length;k++) {
				for (int l=0;l<list[k].size();l++) {
					hög[s++]=list[k].poll();
				}
				//list[k].clear();
			}
		}
	}

	public static void main(String[] args) {
		int[] hej= {329,457,657,839,436,720,355};
		sortera(hej);
		System.out.println(Arrays.toString(hej));

	}

}
