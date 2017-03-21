import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Arrays;
public class PermutationPalindrome {

	/**
	 * @param args
	 *            Write an efficient function that checks whether any
	 *            permutation ↴ of an input string is a palindrome ↴ . Examples:
	 *            "civic" should return True "ivicc" should return True "civil"
	 *            should return False "livci" should return False
	 * 
	 *            Solution :- The palindrome of a string will have only one
	 *            alphabet that would have ODD no of occurance
	 */

	public boolean PermutationCalculator(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			int value = 1;
			if (hm.containsKey(c)) {
				hm.put(c, (hm.get(c) + 1));
			} else {
				hm.put(c, value);
			}

		}
		/**
		 * @param str
		 *            code to print the content of the hashmap. Currently
		 *            commented out
		 * @return
		 */

		// for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
		// char ch2 = entry.getKey();
		// int i = entry.getValue();
		// System.out.println("key:- " + ch2 + " value :- " + i);
		// }
		if (!PermCalculator(hm)) {
			return false;
		}
		return true;
	}

	/**
	 * @param hashmap
	 *            recieves the hashmap where the character and its corresponding
	 *            number of occurances are stored. whenever the method come
	 *            across an occurance of a second character with odd number of
	 *            occurance , the method would return false.
	 * 
	 * @return
	 */
	private boolean PermCalculator(HashMap<Character, Integer> hashmap) {
		int sumOfOddNumbers = 0;
		for (Map.Entry<Character, Integer> entry : hashmap.entrySet()) {
			int i = entry.getValue() % 2;
			int j = entry.getKey();
			if (i != 0) {
				sumOfOddNumbers++;
			}
			if (sumOfOddNumbers > 1) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		
		int[] x = {2,4,56,1,4,6,9,3,1};
		Arrays.sort(x);
		for(int a : x){
			System.out.println(a);
		}
		// TODO Auto-generated method stub
		PermutationPalindrome pp = new PermutationPalindrome();
		System.out.println("civic is " + pp.PermutationCalculator("civic")
				+ " palindrome");
		System.out.println("ivicc is " + pp.PermutationCalculator("ivicc")
				+ " palindrome");
		System.out.println("civil is " + pp.PermutationCalculator("civil")
				+ " palindrome");
		System.out.println("livci is " + pp.PermutationCalculator("livci")
				+ " palindrome");

	}

}
