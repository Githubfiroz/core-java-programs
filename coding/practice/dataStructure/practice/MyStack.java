package coding.practice.dataStructure.practice;

import java.util.Arrays;

public class MyStack {
	public Integer[] push(int myParamStack[], int numberToPush) {
		int n = myParamStack.length;

		Integer myNewStack[] = new Integer[n + 1];
		int myNewStackLength = myNewStack.length;

		for (int i = 0; i < myNewStackLength; i++) {
			if (i == myNewStackLength - 1)
				myNewStack[i] = numberToPush;
			else
				myNewStack[i] = myParamStack[i];
		}

		System.out.println("After push - Existing array : " + Arrays.toString(myNewStack));
		System.out.println("length: " + myNewStack.length);
		return myNewStack;
	}

	public Integer[] pop(int myParamStack[]) {
		int n = myParamStack.length;

		Integer myNewStack[] = new Integer[n - 1];

		for (int i = 0; i < n; i++) {
			if (i != n - 1) {
				myNewStack[i] = myParamStack[i];
			}
		}

		System.out.println("After pop - Existing array : " + Arrays.toString(myNewStack));
		System.out.println("length: " + myNewStack.length);
		return myNewStack;
	}
}
