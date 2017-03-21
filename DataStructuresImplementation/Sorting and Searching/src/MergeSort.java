public class MergeSort {
	private int[] arr;
	private int[] temp;
	private int len;

	public int[] driver(int[] inputArray) {
		arr = inputArray;
		temp = new int[inputArray.length];
		int low = 0;
		int high = inputArray.length - 1;
		divide(low, high);
		return arr;
	}

	public void divide(int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			divide(low, mid);
			divide(mid + 1, high);
			merge(low, mid, high);
		}
	}

	public void merge(int low, int mid, int high) {
		for (int i = low; i <= high; i++) {
			temp[i] = arr[i];
		}
		int i = low, j = mid + 1, k = low;
		while (i <= mid && j <= high) {
			// System.out.println("1");
			if (temp[i] <= temp[j]) {
				arr[k] = temp[i];
				i++;
			} else {
				arr[k] = temp[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			arr[k] = temp[i];
			k++;
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort obj = new MergeSort();
		int[] inputArray = { 2, 6, 2, 8, 3, 9, 1, 6, 3, 8, 3 };
		int[] outputArray = obj.driver(inputArray);
		for (int a = 0; a < outputArray.length; a++) {
			System.out.print(outputArray[a] + " ");
		}

	}
}
