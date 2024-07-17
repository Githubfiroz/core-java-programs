package first.hello.test;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		
		Employee employee = new Employee();
		/*
		employee.setId(1001);
		employee.setName("Paddu Aaban");
		employee.setAddress("Louisville");
		
		System.out.println("Employee details :");
		System.out.println("	Id>>"+employee.getId());
		System.out.println("	Name>>"+employee.getName());
		System.out.println("	Address>>"+employee.getAddress());
		*/
		System.out.println("Please enter Employee id :");
		Scanner scanner = new Scanner(System.in);
		employee.setId(scanner.nextInt());
		
		System.out.println("Enter Employee name :");
		employee.setName(scanner.next());
		
		System.out.println("Enter Employee address :");
		employee.setAddress(scanner.next());
		scanner.close();
		
		System.out.println("You have entered Employee details as :");
		System.out.println("	Id>>"+employee.getId());
		System.out.println("	Name>>"+employee.getName());
		System.out.println("	Address>>"+employee.getAddress());

	}

}
