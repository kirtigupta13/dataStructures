import java.util.Arrays;
public class StringAllUniqueWithoutDS {

	/**
	 * @param args
	 *            :Determining a string has all unique characters without
	 *            using additional data structures and without the
	 *            lowercase characters assumption
	 */
	public boolean[] alphabeticalArray = new boolean[26];

	public boolean checkerWithoutDS(String str) {
		
		
		String str2 = str.toLowerCase();
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		 for(int i = 0; i <ch.length-1;i++){
			 if (ch[i]==ch[i+1]){
				 return false;
			 }
		 }
		 return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringAllUniqueWithoutDS obj = new StringAllUniqueWithoutDS();
		System.out.println(obj.checkerWithoutDS("HJjagvir"));
		
		
	}

}
