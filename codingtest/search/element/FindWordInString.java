package codingtest.search.element;

public class FindWordInString {

	public static void main(String[] args) {
		//String strSentence = "Hi How are you";
		//String strWord = "you";
		
		String strSentence = "Welcome to Mumbai.";
		String strWord = "to";
		
		boolean flag = false;

		flag = isContainsWord(strSentence, strWord);
		
		if (flag)
			System.out.println("Word '" + strWord + "' is available.");
		else
			System.out.println("Word '" + strWord + "' is not available.");

	}

	public static boolean isContainsWord(String sentence, String wordToCompare) {
		boolean contains = false;

		for (String word : sentence.split(" ")) {
			
			if (wordToCompare.equals(word)) {
				contains = true;
				break;
			}
			 //System.out.println("word : "+word);
		}

		return contains;
	}

}
