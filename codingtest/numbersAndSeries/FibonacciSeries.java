package codingtest.numbersAndSeries;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0, 1, 1, 2, 3, 5, 8, 13, 21
		System.out.println("Enter a number :");
		Scanner scanner = new Scanner(System.in);
		int maxNumber = Integer.parseInt(scanner.nextLine());
		int n1 = 0, n2 = 1, n3 = 0;
		String fibonacci = "";

		for (int i = 0; i < maxNumber; i++) {
			if (i == 0)
				fibonacci = fibonacci + i;
			else if (i == 1)
				fibonacci = fibonacci + ", " + i;
			else {
				n3 = n1 + n2;
				fibonacci = fibonacci + ", " + n3;

				n1 = n2;
				n2 = n3;

			}

		}
		System.out.println(fibonacci);

	}

}
