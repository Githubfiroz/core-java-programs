package coding.practice.dataStructure.practice;

import java.util.Arrays;
import java.util.Scanner;

public class StackImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myStack[] = { 1, 2, 3 };
		System.out.println("Existing array : " + Arrays.toString(myStack));
		
		System.out.println("Enter 1 for 'push' or 2 for 'pop' :");
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());
		// scanner.close();
		int numberToPush = 0;

		if (number == 1) {
			System.out.println("Enter number to push : ");
			scanner = new Scanner(System.in);
			numberToPush = Integer.parseInt(scanner.nextLine());
			scanner.close();
			push(myStack, numberToPush);
		} else if (number == 2)
			pop(myStack);
		else {
			System.out.println("Not a valid number for operation");
		}

	}

	public static void push(int myParamStack[], int numberToPush) {
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
	}

	public static void pop(int myParamStack[]) {
		int n = myParamStack.length;

		Integer myNewStack[] = new Integer[n - 1];

		for (int i = 0; i < n; i++) {
			if (i != n - 1) {
				myNewStack[i] = myParamStack[i];
			}
		}

		System.out.println("After pop - Existing array : " + Arrays.toString(myNewStack));
		System.out.println("length: " + myNewStack.length);
	}
}
