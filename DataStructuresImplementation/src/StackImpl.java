public class StackImpl {
	// innner class defining Node
	public class Node {
		Node next;
		int data;
	}

	public Node head;

	public void Enqueue(int data) {
		if (head == null) {
			head = new Node();
			head.data = data;

		} else {
			Node counter = new Node();
			counter.data = data;
			counter.next = head;
			head = counter;
		}
	}

	public int Dequeue() {
		int retData = 0;
		if (head == null) {
			System.out.println("The stack is empty");
		} else {

			retData = head.data;
			head = head.next;

		}

		return retData;
	}

	public void display() {
		Node disp = head;
		while (disp != null) {
			System.out.print(disp.data + " ");
			disp = disp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImpl obj = new StackImpl();
		obj.Enqueue(2);
		obj.Enqueue(22);
		obj.Enqueue(23);
		obj.Enqueue(24);
		obj.Enqueue(25);
		obj.Enqueue(26);
		obj.Enqueue(37);
		obj.display();
		System.out.println();
		System.out.println(obj.Dequeue());
		obj.display();
	}

}
