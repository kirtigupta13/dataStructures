import java.util.Random;

public class matrixRotation {

	/**
	 * @param args
	 *            print a linkedlist reverses linkedlist finding middle of
	 *            linkedlist intersection of arrays
	 * 
	 * 
	 */

	public void MatrixCreator(int row, int column) {
		byte[][] matrix = new byte[row][column];
		byte b = 0000;
		 
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = b;
				b++;
			}
		}
		disp(matrix);
		MatrixReverser(matrix);

	}

	public void disp(byte[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void MatrixReverser(byte[][] matrix) {
		int counter = 0;
		int row = matrix[0].length;
		int col = matrix.length;
		System.out.println("row  :- " + row + " col :- " + col);
		byte[][] matrix2 = new byte[row][col];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix2[j][(col - 1) - i] = matrix[i][j];
			}
			counter++;
		}
		disp(matrix2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		matrixRotation obj = new matrixRotation();
		obj.MatrixCreator(3, 10);
	}

}
