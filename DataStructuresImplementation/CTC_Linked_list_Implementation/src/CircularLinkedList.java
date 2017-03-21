public class CircularLinkedList {

	/**
	 * @param args
	 *            Detect and Remove Loop in a Linked List Write a function
	 *            detectAndRemoveLoop() that checks whether a given Linked List
	 *            contains loop and if loop is present then removes the loop and
	 *            returns true. And if the list doesn’t contain loop then
	 *            returns false. Below diagram shows a linked list with a loop.
	 *            detectAndRemoveLoop() must change the below list to
	 *            1->2->3->4->5->NULL.
	 */

	private class Node {
		int data;
		Node next;
	}

	private void displayList(Node node) {
		Node n = node;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}

	}

	private Node llCreator(int[] list) {
		Node head = null;
		Node counter = null;
		for (int i = 0; i < list.length; i++) {
			if (head == null) {
				head = new Node();
				counter = head;
				counter.data = list[i];

			} else {
				Node node = new Node();
				node.data = list[i];
				counter.next = node;
				counter = counter.next;
			}

		}

		return head;
	}

	private boolean loopFinder(Node node) {
		Node slow = node;
		Node fast = node.next;
		while (fast.next != null) {
			if (slow == fast) {
				return true;
			}
			fast= fast.next.next;
			slow=slow.next;
		}
		return false;
	}

	private void runner(int[] list) {
		Node n = llCreator(list);
		displayList(n);

		while (n.next.next != null) {
			n = n.next;
		}
		Node m = n.next;
		m.next = n;
//		displayList(n);
		System.out.println("is there a loop formation :-          "+loopFinder(n));
//		loopFinder(n);
	}

	public static void main(String[] args) {
		CircularLinkedList obj = new CircularLinkedList();
		int[] list = { 1, 2, 3, 4, 5 };
		obj.runner(list);
	}

}
