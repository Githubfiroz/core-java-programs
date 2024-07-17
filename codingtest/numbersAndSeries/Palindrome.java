package codingtest.numbersAndSeries;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a no : ");

		String providedNumber = scanner.nextLine();
		System.out.println("providedNumber = " + providedNumber);

		int providedNumberLength = providedNumber.length();
		scanner.close();

		String reverse = "";

		for (int i = providedNumberLength - 1; i >= 0; i--) {
			reverse = reverse + providedNumber.charAt(i);
		}
		if (providedNumber.equals(reverse))
			System.out.println(providedNumber + ">>Provided Number is a Palindrome >>" + reverse);
		else
			System.out.println(providedNumber + ">>Provided Number is not a Palindrome >>" + reverse);
	}
}
