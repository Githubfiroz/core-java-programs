package codingtest.search.element;

public class ContainsCommonElement {

	public static void main(String[] args) {
		
		char[] arrGroupA = { 'a', 'b', 'c', 'x' };
		char[] arrGroupB = { 'z', 'a', 'x' };
		
		boolean flag = IsElementAvailable(arrGroupA, arrGroupB);
		System.out.println("Contains common element : "+flag);
		
		
	}
	public static boolean IsElementAvailable(char[] arrA, char[] arrB) {
		boolean flag = false;
		
		for (char a : arrA) {
			for (char b : arrB) {
				if (a == b) {
					flag=true;
					//System.out.println(b + " : True");
				}
			}
		}
		
		return flag;
	}
}
