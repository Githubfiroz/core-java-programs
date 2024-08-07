package knowledge.explore;

import java.util.Arrays;

public class NameComparator {

	public static void main(String[] args) {
		int[] intArr = {5,9,1,10};
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(5,"John");
		empArr[1] = new Employee(9,"Paul");
		empArr[2] = new Employee(1,"Amit");
		empArr[3] = new Employee(10,"Ame");
		
		Arrays.sort(empArr);
		System.out.println("sorted "+Arrays.toString(empArr));
		
		Arrays.sort(empArr, Employee.NameComparator);
		System.out.println("sorted "+Arrays.toString(empArr));

	}

}
