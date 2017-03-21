public class StackImplementationUsingTwoArray {

	/**
	 * @param args
	 */
	int[] arr1 = new int[10];
	int[] arr2 = new int[10];

	public void push(int data) {
		int i = 0;
		while (i < arr1.length) {
			if (arr1[i] == 0) {
				arr1[i] = data;
			}
			i++;
		}
	}

	public void peek() {
		System.out.println();

	}

	public static void main(String[] args) {
		StackImplementationUsingTwoArray obj = new StackImplementationUsingTwoArray();
		for (int i = 0; i < 10; i++) {
			obj.push((int) ((Math.random() * 10) + 1));
		}

	}

}
