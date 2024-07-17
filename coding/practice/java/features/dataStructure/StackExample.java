package coding.practice.java.features.dataStructure;

public class StackExample {

	private int arr[];
	private int top;
	private int capacity;

	// push, pop, size, isEmpty, isFull, stackTrace

	StackExample(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int x) {
		if (isFull()) {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
		System.out.println("Inserting " + x);
		arr[++top] = x;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Empty.");

			System.exit(1);
		}
		return arr[top--];
	}
	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}

	public int getSize() {
		return top + 1;
	}

	public void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + ", ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackExample stack = new StackExample(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.print("Stack : ");
		stack.printStack();

		stack.pop();
		System.out.println("\n After poppping out : ");
		stack.printStack();

	}

}
