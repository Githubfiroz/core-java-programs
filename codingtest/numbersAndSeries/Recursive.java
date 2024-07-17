package codingtest.numbersAndSeries;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// rec(3);
		System.out.println("rec(5)>>" + rec(5));
	}

	public static int rec(int num) {

		if (num == 1)
			return 1;
		else
			return num * rec(num - 1);
	}
}
