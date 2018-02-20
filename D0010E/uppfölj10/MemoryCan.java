package uppfölj10;

import java.util.NoSuchElementException;

public class MemoryCan {
	private Object[] store;
	private int[] idNumbers;
	private int numUsed=0;
	private int maxSize;
	private static int cans=0;
	
	public MemoryCan(int size) {
		store=new Object[size];
		idNumbers=new int[size];
		maxSize=size;
		cans++;
	}
	
	public void insert(Object obj,int id) {
		if(numUsed==maxSize) {
			store[numUsed]=obj;
			idNumbers[numUsed]=id;
			numUsed++;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public Object retrive(int id) {
		for(int i=0;i<=numUsed;i++) {
			if(idNumbers[i]==id) {
				Object returnvalue=store[i];
				for(int j=i;j<numUsed;j++) {
					store[j]=store[j+1];
					idNumbers[j]=idNumbers[j+1];
				}
				numUsed--;
				return returnvalue;
			}
		}
		throw new NoSuchElementException();
	}
	
	public boolean exists(int id) {
		for(int i=0;i<=numUsed;i++) {
			if(idNumbers[i]==id) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return numUsed+1;
	}
	
	public int numberOfCans() {
		return cans;
	}
	public static void main(String[] args) {
	

	}

}
