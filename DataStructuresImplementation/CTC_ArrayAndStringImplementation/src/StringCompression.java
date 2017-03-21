import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class StringCompression {

	/**
	 * @param args
	 *            implement a method which performs basic string compression by
	 *            counting sequences of repeating characters. Given "aaabbbccc"
	 *            it should return "a3b3c3".
	 */

	public String StringCompressor(String str1) {
		String str2 = new String();
		String str = StringSorter(str1);
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			int value = 1;
			if (!hm.containsKey(ch[i])) {
				hm.put(ch[i], value);
			} else {
				hm.put(ch[i], (hm.get(ch[i]) + 1));
			}
		}
		Iterator it = hm.entrySet().iterator();
		StringBuilder sb = new StringBuilder();
		int sumOfCharsGreaterThanOne = 0;
		while (it.hasNext()) {

			HashMap.Entry pair = (HashMap.Entry) it.next();
			sb.append(pair.getKey()).append(pair.getValue());
			int x = (Integer) pair.getValue();

			if (((Integer) pair.getValue()) > 1) {
				sumOfCharsGreaterThanOne++;
			}
		}
		if (sumOfCharsGreaterThanOne == 0) {
			return str1;
		}
		str2 = sb.toString();
		return str2;

	}

	public String StringSorter(String str) {

		char[] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		Arrays.sort(ch);
		for (char c : ch) {
			sb.append(c);
		}
		str = sb.toString();
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompression obj = new StringCompression();
		System.out.println(obj.StringCompressor("jagvir"));

	}

}
