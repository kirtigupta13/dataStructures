
public class BitTutorial {

	/**
	 * @param args
	 */
	private void bitOperators(int x , int y ){
		System.out.println(32>>x);
		System.out.println(x);
		System.out.println(x & y);
		
		System.out.println(x | y);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitTutorial obj = new BitTutorial();
		obj.bitOperators(7, 5);
	}

}
