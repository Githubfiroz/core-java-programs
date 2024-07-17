package codingtest.numbersAndSeries;

import java.util.Scanner;

public class Fibonacci {
	// 0, 1, 1, 2, 3, 5, 8, 13
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a no : ");

		int providedNumber = Integer.parseInt(scanner.nextLine());
		// System.out.println("providedNumber = " + providedNumber);

		scanner.close();

		String fibonacci = "";
		int n1 = 0, n2 = 1, n3 = 0;

		for (int i = 0; i < providedNumber; i++) {
			if (i == 0) {
				fibonacci = fibonacci + i;
			} else if (i == 1) {
				fibonacci = fibonacci + ", " + i;
			} else {
				n3 = n1 + n2;
				fibonacci = fibonacci + ", " + n3;

				n1 = n2;
				n2 = n3;
			}
		}
		System.out.println(">>fibonacci >>" + fibonacci);
	}
}
