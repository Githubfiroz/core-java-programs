package coding.practice.java.features.dataStructure;

public class LinkedListImpl {

	Node head;

	static class Node {
		int value;

		Node next;

		Node(int d) {
			value = d;
			next = null;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListImpl linkedListImpl = new LinkedListImpl();

		linkedListImpl.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		linkedListImpl.head.next = second;
		second.next = third;

		System.out.print("Linked list :");
		while (linkedListImpl.head != null) {

			System.out.print(linkedListImpl.head.value + " ");
			linkedListImpl.head = linkedListImpl.head.next;
		}
	}

}
