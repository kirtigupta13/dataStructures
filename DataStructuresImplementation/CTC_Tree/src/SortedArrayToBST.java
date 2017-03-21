public class SortedArrayToBST {

	/**
	 * @param args
	 */
	private class Node {
		Node leftNode;
		Node rightNode;
		int data;

		private Node(int data) {
			this.data = data;
			leftNode = null;
			rightNode = null;
		}
	}

	Node root;

	public SortedArrayToBST() {
		root = null;
	}

	public void BSTCreator(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		root = BSTCreator(arr, low, high);
	}

	public Node BSTCreator(int[] arr, int low, int high) {
		Node node = null;
		if (low > high)
			return null;
		else {
			int mid = low + (high - low) / 2;
			node = new Node(arr[mid]);
			node.leftNode = BSTCreator(arr, low, mid - 1);
			node.rightNode = BSTCreator(arr, (mid + 1), high);
		}
		return node;

	}

	public void displayTree() {
		displayTree(root);
	}

	private void displayTree(Node node) {
		if (node == null)
			return;
		displayTree(node.leftNode);
		System.out.print(node.data + " ");
		displayTree(node.rightNode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedArrayToBST obj = new SortedArrayToBST();
		int[] arr = { 1, 2, 3, 4, 5, 6};
		obj.BSTCreator(arr);
		obj.displayTree();
		
	}

}
