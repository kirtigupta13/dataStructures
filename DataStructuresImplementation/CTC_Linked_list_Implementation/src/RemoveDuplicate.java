import java.util.HashSet;

public class RemoveDuplicate {

	/**
	 * @param args
	 *            Write a removeDuplicates() function which takes a list and
	 *            deletes any duplicate nodes from the list. The list is not
	 *            sorted.
	 * 
	 *            For example if the linked list is 12->11->12->21->41->43->21
	 *            then removeDuplicates() should convert the list to
	 *            12->11->21->41->43.
	 */
	public class Node {
		Node next;
		int data;
	}

	

	public void disp(Node head) {
		Node c = head;
		while (c.next != null) {
			System.out.println(c.data + " ");
			c = c.next;
		}
	}

	public void llCreator(int[] list) {
		  Node head=null;
		  Node temp=null;
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
		// disp();
		duplicateRemover(head);
		disp(head);
	}

	public void duplicateRemover(Node head) {
		Node prev = null, foll = head;
		// System.out.println(head);
		// System.out.println(foll);
		HashSet<Integer> hm = new HashSet<Integer>();
		if (foll.next == null) {
			System.out.println("List contains only one element");
		}
		while (foll.next != null) {
			// System.out.println("here");
			if (!hm.contains(foll.data)) {
				hm.add(foll.data);
				prev = foll;
				foll = foll.next;
			} else {
				prev.next = foll.next;
				foll = foll.next;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list2 = { 12 };
		int[] list = { 12, 11, 21, 41, 43, 21, 41, 43, 54, 34, 54, 34 };
		RemoveDuplicate rm = new RemoveDuplicate();
		 rm.llCreator(list);
		rm.llCreator(list2);
	}

}
