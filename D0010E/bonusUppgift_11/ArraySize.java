package bonusUppgift_11;

/** Counts the amount of single elements in a 3 dimensional array
 * 
 * @author Anton Johansson
 *
 */

public class ArraySize {
	/** Counts the amount of single elements in a 3 dimensional array
	 * 
	 * @param a the 3dimensional array that you want to know the single elements of
	 * @return the amount of single elements
	 */
	public static int arraySize(int[][][] a) {
		return arraySize3d(a);
	}

	private static int arraySize1d(int[] a) {
		int count = 0, b;
		try {
			while (true) {// Go through the array and look where the array stops(IndexOutOfBounds)
				try {
					b = a[count];// If a is null break and return
				} catch (NullPointerException e) {
					break;
				}
				count++;
			}
		} catch (IndexOutOfBoundsException e) {
			return count;
		}
		return 0;
	}

	private static int arraySize2d(int[][] a) {
		int count = 0, index = 0;
		int[] b;
		try {
			while (true) { // Go through the array and look where the array stops(IndexOutOfBounds)
				try {
					b = a[index]; // If a is null break and return
				} catch (NullPointerException e) {
					break;
				}
				count += arraySize1d(b);// check how many elements is in the 1d array
				index++;
			}
		} catch (IndexOutOfBoundsException e) {
		}
		return count;
	}

	private static int arraySize3d(int[][][] a) {
		int count = 0, index = 0;
		int[][] b;
		try {
			while (true) { // Go through the array and look where the array stops(IndexOutOfBounds)
				try {
					b = a[index]; // If a is null break and return
				} catch (NullPointerException e) {
					index++;
					break;
				}
				count += arraySize2d(b); // check how many elements is in the 2d array
				index++;
			}
		} catch (IndexOutOfBoundsException e) {
			return count;
		}
		return 0;
	}

	public static void main(String[] args) {
		int[][][][] b = { // b är en 4D-array med de 10 testfallen
				null, 
				{ { {} } }, 
				{ { {} }, { {} } }, 
				{ null, { { 1, 2, 3 }, { 1, 2, 3 } } },
				{ { null }, { null }, { null } }, 
				{ { { 1, 2, 3 } } }, { { { 1, 2, 3 }, { 1, 2, 3 } } },
				{ { { 1, 2, 3 }, {}, { 1, 2, 3 }, null } }, 
				{ { { 1, 2, 3 } }, {}, { { 1, 2, 3 } }, null },
				{ { { 1 }, null, { 2 }, { 3, 4 } }, {}, null, { { 5, 6 }, {}, { 7 } } } 
				};
		for (int i = 0; i < b.length; i++) {
			System.out.println("" + i + " : " + arraySize(b[i]));
		}

	}

}
