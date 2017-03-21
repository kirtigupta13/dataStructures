public class LinkedListPalindromeInPlace {

	private class Node {
		int data;
		Node next;
	}

	public void displayList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public Node listCreator(int[] list) {
		Node head = null;
		Node counter = null;
		for (int i = 0; i < list.length; i++) {
			if (head == null) {
				head = new Node();

				head.data = list[i];
				counter = head;
				counter.next = null;

			} else {
				Node node = new Node();
				node.data = list[i];
				counter.next = node;
				counter = counter.next;

			}
		}
		return head;

	}

	public Node llMiddleFinder(Node node) {

		if (node == null || node.next == null) {
			return null;
		} else {
			Node middle = node;
			Node end = node;
			Node temp = null;
			while (end != null && end.next != null) {
				middle = middle.next;
				end = end.next.next;
			}
			Node pass = middle.next;
			middle.next = null;
			return pass;
		}

	}

	public Node llReversor(Node node) {
		Node rear = node;
		Node front = node.next;
		Node temp = null;
		rear.next = null;
		while (front != null) {
			temp = front.next;
			front.next = rear;
			rear = front;
			front = temp;
			temp = null;
		}
		return rear;
	}

	public boolean newlistCreator(int[] list) {
		Node head = listCreator(list);
		Node rev = llReversor(llMiddleFinder(head));
		Node end = head;
		while (end.next != null) {
			end = end.next;
		}
		end.next = rev;
		displayList(rev);
		displayList(head);

		while (rev != null) {
			if (head.data != rev.data) {
				return false;
			}
			rev = rev.next;
			head = head.next;
		}
		return true;
	}

	public static void main(String[] args) {
		LinkedListPalindromeInPlace obj = new LinkedListPalindromeInPlace();
		int[] list = { 1, 2, 3,4,5,4,3, 2, 1 };
		System.out.println(obj.newlistCreator(list));
		int[] list2 = { 1, 2, 3,4,5,44,3, 2, 1 };
		System.out.println(obj.newlistCreator(list2));
		
	}
}