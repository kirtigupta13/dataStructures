public class InsertionSort {

	/**
	 * @param args
	 */
	private int[] insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] >= array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	private void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}

	public void driver(int[] array) {
		printArray(insertionSort(array));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort isObj = new InsertionSort();
		int[] array = { 9, 9, 8, 7, 7, 6, 5, 5, 4, 4, 4, 3, 2, 1 };
		isObj.driver(array);
	}

}
