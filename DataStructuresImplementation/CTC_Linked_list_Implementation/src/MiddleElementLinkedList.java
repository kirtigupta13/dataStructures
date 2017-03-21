public class MiddleElementLinkedList {

	/**
	 * @param args
	 */
	public class Node {
		Node next;
		int data;
	}

	public void disp(Node head) {
				Node c = head;
		while (c != null) {
			System.out.print(c.data + " ");
			c = c.next;
		}
		System.out.println();
	}

	public int llCreator(int[] list) {
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

		disp(head);
		return middleElementFinder(head);
	}

	public int middleElementFinder(Node head) {
		
		Node slow = head;
		Node fast = head;
		if (fast.next == null) {
			System.out.println("Only one element in the linkedlist");
		} else {
			while (fast != null && fast.next != null) {
				System.out.println("slow is :- " + slow.data + "   fast is :- "
						+ fast.data);
				slow = slow.next;
				fast = fast.next.next;
			}
		}

		return slow.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleElementLinkedList obj = new MiddleElementLinkedList();
		int[] list = { 12, 11, 21, 41, 43, 44, 87, 98 };
		System.out.println("Middle element is :- " + obj.llCreator(list));

	}

}
