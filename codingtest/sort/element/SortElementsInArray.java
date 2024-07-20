package codingtest.sort.element;

import java.util.Arrays;

public class SortElementsInArray {

	public static void main(String[] args) {
		int[] numArray = { 20, 3, 6, 1, 9, 10 };
		sortedArray(numArray, "ascending");
		sortedArray(numArray, "descending");
	}

	public static void sortedArray(int[] originalArray, String order) {
		System.out.print(order+": ");
		int temp, count = 0, innerCount;
		for (int i : originalArray) {
			innerCount = 0;

			for (int j : originalArray) {

				if (order.contentEquals("ascending")) {
					if (originalArray[count] < originalArray[innerCount]) {
						temp = originalArray[count];
						originalArray[count] = originalArray[innerCount];
						originalArray[innerCount] = temp;
					}
				} else {
					if (originalArray[count] > originalArray[innerCount]) {
						temp = originalArray[count];
						originalArray[count] = originalArray[innerCount];
						originalArray[innerCount] = temp;
					}
				}
				innerCount++;
			}
			count++;
		}
		System.out.println(Arrays.toString(originalArray));
	}
}
