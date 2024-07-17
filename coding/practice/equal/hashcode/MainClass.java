package coding.practice.equal.hashcode;

public class MainClass {

	public static void main(String[] args) {
		//System.out.println("Hello !!");
		Employee emp1 = new Employee();
		emp1.setId(1);
//		emp1.setEmployeeName("John");
		

		Employee emp2 = new Employee();
		emp2.setId(1);
		emp2.setEmployeeName("John");
		
		System.out.println("Shallow compare -> emp1 == emp2 : "+(emp1==emp2));
		
		System.out.println("Deep compare -> emp1.equals(emp2) : "+(emp1.equals(emp2)));
		
	
	}

}

