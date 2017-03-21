import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.*;

public class ArrayReverse {
	int x = 0;

	public void arrayReversor(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		int[] arr = {};
		try {
			System.out.println("enterthe array size");
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			int arrayLen = input.read();
			arr = new int[arrayLen];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) ((Math.random() * 100) / 10);
				System.out.print(arr[i] + " ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		ArrayReverse obj = new ArrayReverse();
		obj.arrayReversor(arr);

	}

}
