public class LinkedListPalindrome {

	/**
	 * @param args
	 */
	public class Node {
		Node next;
		int data;
	}

	public void disp(Node head) {
		System.out.println("list is :- ");
		Node c = head;
		while (c != null) {
			System.out.print(c.data + " ");
			c = c.next;
		}
		System.out.println();
	}

	public Node llCreator(int[] list) {
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

		return head;
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

	public boolean palindromChecker(int[] list) {
		Node firstList = llCreator(list);
		Node secondList = llReversor(firstList);
		while (firstList != null && secondList != null) {
			
			if (firstList.data != secondList.data) {
				
				return false;
			}
			firstList=firstList.next;
			secondList= secondList.next;
		}
		System.out.println("here");
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListPalindrome obj = new LinkedListPalindrome();
		int[] list = { 1, 2, 3, 4, 3, 2, 1 };
		System.out.println(obj.palindromChecker(list));
	}

}
