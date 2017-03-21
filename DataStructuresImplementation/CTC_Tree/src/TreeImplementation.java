import java.util.NoSuchElementException;

public class TreeImplementation {

	/**
	 * @param args
	 */
	private class Node {
		Node rightNode;
		Node leftNode;
		int data;
	}

	Node root;
	Node counter;

	public TreeImplementation() {
		root = null;

	}

	private void insert(int data) {
		if (root == null) {
			root = new Node();
			root.data = data;
			counter = root;
			return;
		} else {
			if (data < counter.data && counter.leftNode == null) {

				Node node = new Node();
				node.data = data;
				counter.leftNode = node;
				return;

			}
			if (data > counter.data && counter.rightNode == null) {

				Node node = new Node();
				node.data = data;
				counter.rightNode = node;
				return;
			}
			if (data < counter.data && counter.leftNode != null) {
				counter = counter.leftNode;
				insert(data);
				counter = root;

			}
			if (data > counter.data && counter.rightNode != null) {

				counter = counter.rightNode;
				insert(data);
				counter = root;
			}

		}

	}

	private Node rootReturner() {
		return root;
	}

	private void lookup(Node node) {

		if (node == null)
			throw new NoSuchElementException("Tree underflow");
		if (node.leftNode == null && node.rightNode == null) {
			System.out.print(node.data + " "); 
		}
		if (node.leftNode != null) {
			lookup(node.leftNode);
		}
		
		System.out.print(node.data + " ");
		
		
		if (node.rightNode != null) {
			lookup(node.rightNode);
		}
	 

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeImplementation obj = new TreeImplementation();
		obj.insert(1);
		obj.insert(3);
		obj.insert(2);
		obj.insert(6);
		obj.insert(7);
		obj.insert(4);
		Node node = obj.rootReturner();
		obj.lookup(node);

	}

}
