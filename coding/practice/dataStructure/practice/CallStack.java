package coding.practice.dataStructure.practice;

import java.util.Arrays;

public class CallStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myStack[] = { 11, 22, 33 };
		System.out.println("Existing array : " + Arrays.toString(myStack));
		MyStack stack = new MyStack();
		int[] element = { 6, 7, 8 };

		for (int i : element) {
			// System.out.println(i);
			stack.push(myStack, i);
		}
	}
}
