import java.util.Scanner;

public class PrimeFinder {
	double number;
	int counter;
	boolean isPrime;

	public void PrimeFInderM() {
		isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		number = sc.nextDouble();

		sc.close();
		counter = (int) Math.sqrt(number);
		for (int i = 2; i < counter; i++) {
			if (number % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime){System.out.println("The number "+number+"  is Prime");}
		else{System.out.println("The number "+number+" is not Prime");}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrimeFinder pm = new PrimeFinder();
		pm.PrimeFInderM();

	}

}
