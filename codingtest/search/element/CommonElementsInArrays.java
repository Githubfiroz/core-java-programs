package codingtest.search.element;

import java.util.Arrays;

public class CommonElementsInArrays {

	public static void main(String[] args) {

		String resultArray[] = {  };

		String strArray1[] = { "a", "b", "c", "x", "p", "q" };
		// String strArray2 []= {"z","y","i"};
		// String strArray2 []= {"z","y","x"};
		// String strArray2[] = { "z", "b", "x" };
		String strArray2[] = { "c", "b", "p", "q" };
		
		containsElements(strArray1, strArray2, resultArray);

	}

	public static void containsElements(String[] strArray1, String[] strArray2, String[] resultArray) {
		boolean flag = false;

		int count = 0;
		for (String str1 : strArray1) {

			for (String str2 : strArray2) {

				if (str1.contentEquals(str2)) {
					resultArray = resizeArray(resultArray, count + 1);
					resultArray[count] = str2;
					flag = true;
					count++;

				}
			}
		}

		if (!flag)
			System.out.print("There is no matching element available in both the arrays.");
		else
			System.out.print("Matching element available in both the arrays " + Arrays.toString(resultArray));

	}

	public static String[] resizeArray(String[] originalArray, int newSize) {
		// Create a new array with the desired size
		String[] newArray = new String[newSize];

		// Copy elements from the original array to the new array
		for (int i = 0; i < originalArray.length && i < newArray.length; i++) {
			newArray[i] = originalArray[i];
		}

		return newArray;
	}
}
