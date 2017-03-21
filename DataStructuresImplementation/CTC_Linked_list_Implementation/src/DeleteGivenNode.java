public class DeleteGivenNode {

	/**
	 * @param args
	 */
	public class Node {
		Node next;
		int data;
	}

	public void disp(Node head) {
		Node c = head;
		while (c.next != null) {
			System.out.print(c.data + " ");
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
		disp(head);
		Node nodeToDelete = head;
		while (nodePositionToBeDeleted != 1) {
			nodeToDelete = nodeToDelete.next;
			nodePositionToBeDeleted--;
		}
		deleteNode(nodeToDelete);
		disp(head);
	}

	public void deleteNode(Node n) {
		//

		Node nextNode = n.next;
		n.data = nextNode.data;
		n.next = nextNode.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteGivenNode obj = new DeleteGivenNode();
		int[] list = { 12, 11, 21, 41, 43, 21, 41, 43, 54, 34, 54, 34 };
		obj.llCreator(list, 5);

	}

}
