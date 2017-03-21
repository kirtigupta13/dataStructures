public class Merge2 {
	int[] temp;
	int[] array;

	public int[] driver(int[] array) {
		this.array = array;
		temp = new int[array.length];
		divide(0, array.length - 1);
		return array;
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
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		int i = low, j = mid + 1, k = low;
		while (i <= mid && j <= high) {
			if (temp[i] < temp[j]) {
				array[k] = temp[i];
				i++;
			} else {
				array[k] = temp[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			array[k] = temp[i];
			i++;
			k++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Merge2 obj = new Merge2();
		int[] array = { 1, 2, 4, 3, 5, 9, 8, 7, 6, 1, 2, 3 };

		obj.driver(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
