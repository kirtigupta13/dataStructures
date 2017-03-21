import java.util.*;

public class KthElement {

	/**
	 * The aim of this exercise is to determine the kth element in the linked
	 * list from last
	 */
	private class Node {
		int data;
		Node next;

		private Node(int data) {
			this.data = data;
		}

	}

	private Node head = null;

	private Node llCreator(int[] arr) {
		if (arr.length == 0) {
			System.out.println("array is empty");
			return null;
		}
		head = new Node(arr[0]);
		Node counter = head;
		for (int i = 1; i < arr.length; i++) {
			Node node = new Node(arr[i]);
			counter.next = node;
			counter = counter.next;
		}
		return head;

	}

	private void displayNode(Node node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	/**
	 * @param node
	 *            which is the header of the linkedlist
	 */
	private int kthElementFinder(Node node, int k) {
		Node slow = node;
		Node fast = node;
		if (node == null)
			throw new NoSuchElementException("Linkedlist underflow");
		else {

			while (k != 0 && fast != null) {
				fast = fast.next;
				k--;
			}
			while (fast != null) {
				slow = slow.next;
				fast = fast.next;
			}
		}
		return slow.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		KthElement obj = new KthElement();
		obj.displayNode(obj.llCreator(arr));
		int k = 5;
		System.out.println("The " + k + "th element from last =  "
				+ obj.kthElementFinder(obj.llCreator(arr), k));
	}

}
