import java.util.*;

public class minElementInStack {

	/**
	 * @param args
	 */

	private class Node {
		Node next;
		int data;

		private Node(int data) {
			this.data = data;
		}
	}

	Node head = null;

	private void push(int data) {

		if (head == null) {
			head = new Node(data);
			head.next = null;

		} else {
			Node node = new Node(data);
			node.next = head;
			head = node;
		}
	}

	private void stackDisplay(Node node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public Node topOfStack() {
		return head;
	}

	private int minElement() {
		int min = 0;
		Node node = head;
		if (node == null)
			throw new NoSuchElementException("stack underflow");

		else {
			min = node.data;
			node = node.next;
			while (node != null) {
				if (min > node.data)
					min = node.data;
				node = node.next;
			}

		}
		return min;
	}

	public static void main(String[] args) {
		minElementInStack obj = new minElementInStack();

		int i = 10;
		while (i != 0) {
			obj.push((int) ((Math.random() * 10)+1));
			i--;
		}
		System.out.println("The top of stack item is :- "
				+ obj.topOfStack().data + " for a given stack of :-");
		obj.stackDisplay(obj.topOfStack());
		System.out.println("The min element is :- " + obj.minElement());

	}

}
