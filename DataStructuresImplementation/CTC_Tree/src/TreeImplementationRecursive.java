public class TreeImplementationRecursive {

	/**
	 * @param args
	 */
	private Node root;
	private class Node {
		Node leftNode;
		Node rightNode;
		int data;

		private Node(int data) {
			leftNode = null;
			rightNode = null;
			this.data = data;
		}
	}

	public void insertNode(int data) {
		root = insertNode(root,data);
	}

	public void printTree() {
		printTree(root);
	}

	private Node insertNode(Node node, int data) {
		if (node == null)
			node = new Node(data);
		else {
			if (data <= node.data) {
				node.leftNode = insertNode(node.leftNode, data);
			} else {
				node.rightNode = insertNode(node.rightNode, data);
			}

		}
		return node;
	}

	private void printTree(Node node) {
		if (node == null)
			return;
		else {

			printTree(node.leftNode);
			System.out.println(node.data + " ");
			printTree(node.rightNode);
		}
	}

	public static void main(String[] args) {
		TreeImplementationRecursive obj = new TreeImplementationRecursive();
		obj.insertNode(2);
		obj.insertNode(4);
		obj.insertNode(7);
		obj.insertNode(3);
		obj.insertNode(1);
		obj.insertNode(2);
		obj.insertNode(4);
		obj.insertNode(7);
		obj.insertNode(3);
		obj.insertNode(1);
		obj.printTree();

	}

}
