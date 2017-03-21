public class LinkedListIntersection {

	/**
	 * @param args
	 */
	private class Node {
		int data;
		Node next;
	}

	private class returnDetail {
		Node returnNode;
		int length;
	}

	private void displayList(returnDetail ret) {
		Node node = ret.returnNode;
		int length = ret.length;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println("length of list is :- " + length);
	}

	private boolean diffFinder(returnDetail list1, returnDetail list2) {
		int lengthList1 = list1.length;
		int lengthList2 = list2.length;
		Node node1 = list1.returnNode;
		Node node2 = list2.returnNode;
		System.out.println(lengthList1 + " " + lengthList2);
		int diff = Math.abs(lengthList1 - lengthList2);
		System.out.println(diff);
		if (lengthList1 > lengthList2) {

			while (diff != 0) {

				node1 = node1.next;
				diff--;
			}

			while (node1.next != null && node2.next != null) {
				System.out.println(node1.data + "    " + node2.data);
				if (node1.next == node2.next) {
					return true;
				}
				node1 = node1.next;
				node2 = node2.next;
			}

		}
		return false;
	}

	private returnDetail linkedListCreator(int[] list) {
		Node head = null;
		Node counter = null;
		returnDetail obj = null;
		int length = 0;
		for (int i = 0; i < list.length; i++) {
			if (head == null) {
				head = new Node();
				head.data = list[i];
				counter = head;
				length++;
			} else {
				Node node = new Node();
				node.data = list[i];
				counter.next = node;
				counter = counter.next;
				length++;

			}
			obj = new returnDetail();
			obj.returnNode = head;
			obj.length = length;
		}
		return obj;
	}

	public void runner(int[] list1, int[] list2) {
		returnDetail ret1 = linkedListCreator(list1);
		returnDetail ret2 = linkedListCreator(list2);
		int len1 = ret1.length;
		int len2 = ret2.length;
		// System.out.println(len1 + " " + len2);
		Node head1 = ret1.returnNode;
		Node head2 = ret2.returnNode;
		Node end1 = head1;
		Node end2 = head2;
		while (end1.next != null) {
			end1 = end1.next;
		}
		while (end2.next != null) {
			end2 = end2.next;
		}
		 Node n = new Node();
		 n.data = 9;
		 end1.next = n;
		 end2.next = n;
		 ret1.length++;
		 ret2.length++;
		// System.out.println(ret1.length + " " + ret2.length);
		System.out.println(diffFinder(ret1, ret2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListIntersection obj = new LinkedListIntersection();
		int[] list1 = { 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
		int[] list2 = { 1, 2, 3, 4, 5, 6 };
		obj.runner(list1, list2);
	}

}
