public class BitPalindrome {

	/**
	 * @param args
	 */

	private String convertToString(int data) {
		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		while (flag) {
			int rem = data % 2;
			data = data / 2;
			sb = sb.append(rem);
			if (data == 0) {
				flag = false;
			}
		}
		String ret = sb.toString();

		return ret;
	}

	private boolean isPalindrome(int data) {
		String str = convertToString(data);
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ch[(ch.length - 1) - i]) {
				return false;
			}
		}
		return true;
	}

	private  float isPalindrome(float x) {
		return x;
	}

	private boolean isPalindromeBitManipulator(int data) {
		int temp = data;
		int rev = 0;
		while (temp != 0) {
			rev = rev << 1;
			rev = rev | (temp & 1);
			temp = temp >> 1;
		}
		System.out.println(rev + " " + data);
		if (rev == data)
			return true;
		else
			return false;
	}

	private int setBitFinder(int data) {
		int temp = data;
		int counter = 0;
		while (temp != 0) {

			if ((temp & 1) != 0)
				counter++;
			temp = temp >> 1;
		}
		return counter;
	}

	public static void main(String[] args) {

		BitPalindrome obj = new BitPalindrome();
		float x = 1;
		System.out.println(obj.isPalindrome(x));
		long starttime = System.currentTimeMillis();
		System.out.println(obj.isPalindrome(10));
		long endtime = System.currentTimeMillis();
		System.out.println(endtime - starttime);
		starttime = System.currentTimeMillis();
		System.out.println(obj.isPalindromeBitManipulator(165));
		endtime = System.currentTimeMillis();
		System.out.println(endtime - starttime);
		System.out.println("no of set digit in " + 165 + " is :- "
				+ obj.setBitFinder(165));
	}
}
