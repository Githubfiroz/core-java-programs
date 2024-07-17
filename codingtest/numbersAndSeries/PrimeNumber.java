package codingtest.numbersAndSeries;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a no : ");

		int maxCheck = Integer.parseInt(scanner.nextLine());
		System.out.println("maxCheck = " + maxCheck);
		scanner.close();

		String primeNumbersFound = "";
		for (int i = 2; i <= maxCheck; i++) {
			if (isPrimeNumber(i)) {
				primeNumbersFound = primeNumbersFound + i + ", ";
			}
		}
		System.out.println("primeNumbersFound >>" + primeNumbersFound);
	}

	public static boolean isPrimeNumber(int numberToCheck) {
		int remainder;
		/*
		 * No number is divisible by more than half of itself. So we need to loop
		 * through just numberToCheck/2 . If input is 17, half is 8.5 and the loop will
		 * iterate through values 2 to 8
		 */
		for (int j = 2; j <= numberToCheck / 2; j++) {
			remainder = numberToCheck % j;
			if (remainder == 0) {
				return false;
			}
		}
		return true;
	}
}
