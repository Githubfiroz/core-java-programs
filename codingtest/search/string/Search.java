package codingtest.search.string;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Hello";
		
		Search search = new Search();
		search.SearchRepWord(word);

	}
	
	public void SearchRepWord(String word) {
		char charWord [] = word.toCharArray();
		
		
		
		for(char letter : word.toCharArray()) {
			//System.out.println(letter);
			for(char c : charWord) {
				if(letter == c)
					System.out.println("c>>"+c);
			}
		}
		
	}

}
