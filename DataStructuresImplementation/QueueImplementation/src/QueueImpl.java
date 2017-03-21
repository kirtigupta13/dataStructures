public class QueueImpl<E> {

	/**
	 * This is a queue Implementation using the concept of Qbjects and
	 * linkedlist ... The aim of this exercise is to understand the usage of
	 * queue , its complexity and traversal time and eventually its advantages
	 * over other datastuctures. Just like the Queue API where we will be
	 * checking Insert, Remove and Examine methods and throw exceptions whenever
	 * necessary
	 */
	Node<E> head, temp;

	public class Node<E> {
		E data;
		Node next;
	}

	public void add(E data) {
		if (head == null) {
			head = new Node<E>();
			head.data = data;
			temp = head;

		} else {
			Node<E> counter = new Node<E>();
			counter.data = data;
			temp.next = counter;
			temp = temp.next;

		}

	}

	public  E remove() throws Exception {
		E returnData;
		if(head==null){
				throw new Exception("Queue is Empty");
		}
		else{
			  returnData = (E) head.data;
			  head= head.next;
		}

		return  returnData;
	}

	public void displayM() {
		Node disp = head;
		while (disp != null) {
			System.out.println(disp.data);
			disp = disp.next;
		}
	}

	public static void main(String[] args) throws Exception {
		QueueImpl<Integer> intQueue = new QueueImpl<Integer>();
//		intQueue.remove();
		intQueue.add(12);
		intQueue.add(122);
		intQueue.add(123);
		intQueue.add(124);
		intQueue.add(125);
		intQueue.add(172);
		intQueue.displayM();
		intQueue.remove();
		System.out.println("After removal");
		intQueue.displayM();
	

	}

}
