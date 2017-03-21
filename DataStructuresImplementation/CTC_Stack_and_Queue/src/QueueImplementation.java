import java.util.NoSuchElementException;

public class QueueImplementation<T> {

	/**
	 * @param args
	 *            The <tt>Queue</tt> class represents a first-in-first-out
	 *            (FIFO) queue of generic items. It supports the usual
	 *            <em>enqueue</em> and <em>dequeue</em> operations, along with
	 *            methods for peeking at the first item, testing if the queue is
	 *            empty, and iterating through the items in FIFO order.
	 *            <p>
	 *            This implementation uses a singly-linked list with a static
	 *            nested class for linked-list nodes. See {@link LinkedQueue}
	 *            for the version from the textbook that uses a non-static
	 *            nested class. The <em>enqueue</em>, <em>dequeue</em>,
	 *            <em>peek</em>, <em>size</em>, and <em>is-empty</em> operations
	 *            all take constant time in the worst case.
	 */

	private class Node<T> {
		Node<T> next;
		T data;
	}

	Node<T> head = null;
	Node<T> counter = null;

	private void enqueue(T data) {

		if (isEmpty()) {
			head = new Node<T>();
			counter = head;
			counter.data = data;

		} else {
			Node<T> node = new Node<T>();

			node.data = data;
			counter.next = node;
			counter = counter.next;

		}
	}

	private Node<T> dequeue() {
		if (isEmpty())
			throw new NoSuchElementException("Queue Empty");
		else {
			Node<T> ret = head;
			head = head.next;
			return ret;
		}
	}

	private T peek() {
		if (isEmpty())
			throw new NoSuchElementException("Stack empty");
		else {
			return head.data;
		}
	}

	private boolean isEmpty() {
		if (head == null)
			return true;
		else {
			return false;
		}

	}

	private void displayQueue() {
		Node<T> node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImplementation<String> obj = new QueueImplementation<String>();
		System.out.println(obj.isEmpty());
		obj.enqueue("A");
		obj.enqueue("b");
		obj.enqueue("c");
		obj.enqueue("d");
		obj.enqueue("e");
		obj.enqueue("f");
		System.out.println("after enqueue");
		obj.displayQueue();

		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		System.out.println("After queue");
		obj.displayQueue();
		System.out.println("peeking :-     " + obj.peek());
		System.out.println("peeking :-     " + obj.peek());
		System.out.println("peeking :-     " + obj.peek());
		obj.displayQueue();
		System.out.println(obj.isEmpty());
	}

}
