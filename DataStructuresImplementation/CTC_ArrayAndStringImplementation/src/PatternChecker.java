import java.util.*;

public class PatternChecker {

	public boolean wordPattern(String pattern, String str) {
		Map<Character, String> mp = new HashMap<Character, String>();
		String[] s = str.split(" ");
		char[] chr = pattern.toCharArray();
		int i = 0;
		if (s.length != chr.length)
			return false;

		for (char ch : chr) {

			if ((mp.containsKey(ch) && !mp.get(ch).equals(s[i]))
					|| (!mp.containsKey(ch) && mp.containsValue(s[i]))) {

				return false;

			} else {
				mp.put(ch, s[i]);
			}

			i++;
		}

		return true;
	}

	public static void main(String[] args) {
		PatternChecker obj = new PatternChecker();

		// * 1. pattern = "abba", str = "dog cat cat dog" should return true.
		// * 2. pattern = "abba", str = "dog cat cat fish" should return false.
		// * 3. pattern = "aaaa", str = "dog cat cat dog" should return false.
		// * 4. pattern = "abba", str = "dog dog dog dog" should return false.
		System.out.println(obj.wordPattern("abba", "dog cat cat dog"));
		System.out.println(obj.wordPattern("abba", "dog cat cat fish"));
		System.out.println(obj.wordPattern("aaaa", "dog cat cat dog"));
		System.out.println(obj.wordPattern("abba", "dog dog dog dog"));
	}
}
