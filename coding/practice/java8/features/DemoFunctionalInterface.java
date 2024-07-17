package coding.practice.java8.features;


@FunctionalInterface
public interface DemoFunctionalInterface {

	
	public void showDetails(); // single abstract method and can have any number of static and default method
	
	//public void showDetails1();
	
	public static void showDetails2() {
		System.out.println(" Static method");
	}
	
	static void showDetails3() {
		System.out.println(" Static method");
	}
	
	default void printName() {
		System.out.println("default method");
	}
	
	default void printName2() {
		System.out.println("default method 2");
	}
	
}
