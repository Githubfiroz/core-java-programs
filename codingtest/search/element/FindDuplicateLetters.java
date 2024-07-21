package codingtest.search.element;

import java.util.Arrays;

public class FindDuplicateLetters {

	public static void main(String[] args) {

		//String word = "Firoz";
		// String word = "Hello";
		String word = "Hello welcome to landon.";

		SearchRepWord(word);
	}

	public static void SearchRepWord(String word) {
		int count, wordCount = 0;
		char myWord[] = word.toCharArray();
		char charWord[] = word.toCharArray();

		char resultWord[] = {};
		boolean isWordAvailable = false;

		for (char letter : myWord) {
			//Check if letter already appears earlier
			if (resultWord.length > 0) {
				for (char i : resultWord) {
					if (letter == i) {
						isWordAvailable = true;
					}
				}
			}

			if (!isWordAvailable) {
				count = 0;
				for (char c : charWord) {
					if (letter == c) {
						count++;
					}
				}

				if (count > 1 && letter != ' ') {
					//Below is the code to add/show array elements which appears more than one time.
					resultWord = resizedArray(resultWord, wordCount + 1);
					resultWord[wordCount] = letter;
					wordCount++;
					System.out.print(Arrays.toString(resultWord));

					System.out.println(" Letter " + letter + " appears " + count + " times.");

//					

				} 
			}
			isWordAvailable = false;
		}

		if(wordCount==0)
			System.out.println("There is no letter repeated.");
	}

	public static char[] resizedArray(char[] originalArray, int newSize) {

		char[] newArray = new char[newSize];

		for (int i = 0; i < originalArray.length && i < newArray.length; i++) {
			// System.out.println(originalArray.length +"<org - new>"+ newArray.length);
			newArray[i] = originalArray[i];
		}

		return newArray;

	}

}
