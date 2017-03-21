import java.util.HashMap;

public class TwoStringSimilarityCheck {

	/**
	 * @param args
	 *            Checking if two strings are permutations of each other
	 */
	public int[] alphabetCounter = new int[26];

	public boolean FirstStringAdder(String str1, String str2) {
		for (int i = 0; i < str1.length(); i++) {
			int ASCIIVal = str1.toLowerCase().charAt(i) - 97;

			alphabetCounter[ASCIIVal] = alphabetCounter[ASCIIVal] + 1;

		}

		if (StringChecker(str2, alphabetCounter)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean StringChecker(String str2, int[] alphabetCounter) {

		for (int i = 0; i < str2.length(); i++) {

			int ASCIIVal = str2.toLowerCase().charAt(i) - 97;
			alphabetCounter[ASCIIVal] = alphabetCounter[ASCIIVal] - 1;
		}

		for (int i : alphabetCounter) {
			if (i < 0 || i > 0) {

				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStringSimilarityCheck obj = new TwoStringSimilarityCheck();
		String str1 = "amazonaaaa";
		String str2 = "amazon";
		System.out.println(obj.FirstStringAdder(str1, str2));

	}

}
