package codingtest.copy.elements;

import java.util.Arrays;

public class CoppyArray {

	public static void main(String[] args) {
		int[] intSourceArray = { 34, 3, 12, 9, 6, 2, 8 };
		int[] intDestinationArray = {};

		getCopiedElements(intSourceArray, intDestinationArray);

	}

	public static void getCopiedElements(int[] sourceArray, int[] destinationArray) {

		System.out.println("Source Array : "+Arrays.toString(sourceArray));

		int len = sourceArray.length;
		destinationArray = new int[len];
		for (int i = 0; i < len; i++) {
			destinationArray[i] = sourceArray[i];
		}
		
		System.out.println("Destination Array : "+Arrays.toString(destinationArray));
	}

}
