public class ReverseLinkedList {

	/**
	 * @param args
	 */
	public class Node {
		Node next;
		int data;
	}

	public void disp(Node node) {
		Node c = node;
		while (c != null) {
			System.out.println(c.data + " ");
			c = c.next;
		}
		System.out.println();
	}

	public void llCreator(int[] list, int nodePositionToBeDeleted) {
		Node head = null;
		Node temp = null;
		for (int i = 0; i < list.length; i++) {
			if (head == null) {
				head = new Node();
				head.data = list[i];
				temp = head;

			} else {
				Node n = new Node();
				n.data = list[i];
				temp.next = n;
				temp = n;
			}

		}
		// disp(head);
		disp(llReversor(head));

	}

	public Node llReversor(Node head) {
		Node slow = head;
		Node fast = head.next;
		Node temp = null;
		slow.next = null;

		while (fast != null) {

			temp = fast.next;

			fast.next = slow;

			slow = fast;
			fast = temp;
			temp = null;

		}
		return slow;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList obj = new ReverseLinkedList();
		int[] list = { 12, 11, 21, 41, 43, 21, 41, 43, 54, 34, 54, 34, 98 };
		obj.llCreator(list, 5);
	}
}
