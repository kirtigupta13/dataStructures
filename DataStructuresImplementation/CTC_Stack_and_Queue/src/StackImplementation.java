import java.util.NoSuchElementException;

public class StackImplementation<T> {

	/**
	 * @param args
	 */
	private class Node<T> {
		Node<T> next;
		T data;
	}

	private Node<T> head;

	public StackImplementation() {
		head = null;
	}

	private void push(T data) {

		if (head == null) {
			head = new Node<T>();
			head.data = data;

		} else {

			Node<T> node = new Node<T>();
			node.data = data;
			node.next = head;
			head = node;
		}
	}

	private boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	private T pop() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow");
		T ret = head.data;
		head = head.next;
		return ret;
	}

	private T getTop() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow");

		return head.data;
	}

	private void displayStack() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow");
		Node<T> n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplementation<Integer> obj = new StackImplementation<Integer>();
		System.out.println(obj.isEmpty());
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.push(7);
		System.out.println("after first round of push");
		obj.displayStack();
		obj.pop();
		System.out.println("after pop");
		obj.displayStack();
		System.out.println("top of Stack is :- " + obj.getTop());
		System.out.println(obj.isEmpty());

	}

}
