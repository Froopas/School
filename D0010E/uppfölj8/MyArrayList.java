package uppfölj8;

public class MyArrayList<E> {
	private E[] array;
	private int size;

	public MyArrayList() {
		this.size = 0;
		array = (E[]) new Object[10];
	}

	public void ensureCapacity(int c) {
		E[] newarray=(E[]) new Object[c];
		for(int i=0;i<size;i++) {
			newarray[i]=array[i];
		}
		array=newarray;
	}

	public void add(E e) {
		if (size == array.length) {
			this.ensureCapacity((int) Math.rint(((double) array.length) * 1.5d));
		}
		array[size++] = e;
	}

	public int size() {
		return this.size();
	}

	public E get(int i) throws IndexOutOfBoundsException {
			return array[i];
	}

	public void set(int i, E e) {
		array[i] = e;
	}
	public void trimToSize() {
		int i=0;
		while(array[i]!=null) {
			i++;
		}
		this.ensureCapacity(i);
	}
}
