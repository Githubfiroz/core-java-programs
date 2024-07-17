package codingtest.numbersAndSeries;
import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number :");
		Scanner scanner = new Scanner(System.in);
		
		int maxNumber = Integer.parseInt(scanner.nextLine());
		int count = 0;
		scanner.close();
		for (int i = 2; i <= maxNumber; i++) {
			if (isPrimeNumber(i)) {
				count++;
				System.out.println(count + ">>" + i);
			}
		}
	}

	public static boolean isPrimeNumber(int numberToCheck) {
		int remainder=0;
		// no number is divisible by more than half of itself
		for (int j = 2; j <= numberToCheck / 2; j++) {
			remainder = numberToCheck % j;
			if (remainder == 0)
				return false;			
		}
		return true;
	}

}
