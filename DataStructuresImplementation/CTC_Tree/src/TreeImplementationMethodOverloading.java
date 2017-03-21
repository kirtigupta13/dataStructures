import java.util.NoSuchElementException;
import java.util.Queue;

public class TreeImplementationMethodOverloading {

	/**
	 * @param args
	 */

	public class Node {
		Node rightNode;
		Node leftNode;
		int data;

		public Node(int data) {

			rightNode = null;
			leftNode = null;
			this.data = data;

		}
	}

	private Node root = null;

	public TreeImplementationMethodOverloading() {

		root = null;
	}

	private Node insertNode(int data) {

		root = insertNode(root, data);
		System.out.println("root "+root);
		return root;
	}

	private Node insertNode(Node node, int data) {

		if (node == null) {

			node = new Node(data);

		} else {
			if (data <= node.data) {
				node.leftNode = insertNode(node.leftNode, data);
			} else {
				node.rightNode = insertNode(node.rightNode, data);
			}
		}
		return node;
	}

	private void printTree() {

		printTree(root);

	}

	private void printTree(Node node) {
		if (node == null) {
			return;
		}

		printTree(node.leftNode);
		System.out.print(node.data + " ");
		printTree(node.rightNode);

	}

	public static void main(String[] args) {
		TreeImplementationMethodOverloading obj = new TreeImplementationMethodOverloading();
		obj.insertNode(3);
		obj.insertNode(4);
		obj.insertNode(1);
		obj.insertNode(8);
		obj.insertNode(4);
		Node node = obj.insertNode(13);
		Node node2 = obj.insertNode(2);
		System.out.println("root "+node);
		System.out.println("root "+node2);
//		obj.printTree();
	}

}
