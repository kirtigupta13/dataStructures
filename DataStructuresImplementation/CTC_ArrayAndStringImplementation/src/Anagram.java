//Problem        : Expecto Palindronum
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Your submission should *ONLY* use the following class name
public class Anagram {
	int test = 0;

	public boolean anagramMatcher(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		int[] arr = new int[26];
		char[] chArray = str1.toLowerCase().toCharArray();
		for (int i = 0; i <= chArray.length - 1; i++) {
			int asciiValue = ((int) chArray[i]) - 97;
			arr[asciiValue]++;
		}

		for (int i = 0; i <= str2.length() - 1; i++) {
			char ch = str2.toLowerCase().charAt(i);
			int asciiValue2 = ((int) ch) - 97;
			arr[asciiValue2]--;
			if (arr[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {

		Anagram obj = new Anagram();
		System.out.println(obj.anagramMatcher("jagvir", "jagwir"));
	}
}
