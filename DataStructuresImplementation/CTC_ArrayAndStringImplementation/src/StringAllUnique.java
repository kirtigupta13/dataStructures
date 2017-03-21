public class StringAllUnique {

	/**
	 * @param args
	 *            :Determining a string has all unique characters with and
	 *            using additional data structures and without the
	 *            lowercase characters assumption
	 */
	public boolean[] alphabeticalArray = new boolean[26];

	public boolean checkerWithDS(String str) {
		for (int i = 0; i < str.length(); i++) {

			char ch = str.toLowerCase().charAt(i);
			int ASCIIVal = ((int) ch) - 97;
			System.out.println(ASCIIVal);
			if(alphabeticalArray[ASCIIVal]){
				return false;
			}
			else{alphabeticalArray[ASCIIVal]= true;}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringAllUnique obj = new StringAllUnique();
		
		System.out.println(obj.checkerWithDS("Jjagvir"));
	}

}
