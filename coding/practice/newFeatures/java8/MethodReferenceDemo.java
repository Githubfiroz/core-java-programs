package coding.practice.newFeatures.java8;
/*Method reference is replacement of lambda expression. 
 * It is used to refer method of Functional interface to an existing method. 
 * Mainly it is used for code reusability 
 * Functional Interface's Abstract Method can be mapped to a specific existing method using double colon (::) */

public class MethodReferenceDemo {
	public static void main(String[] args) {

		// Method Reference
		/*
		 * Whenever we have existing implementation of abstract method of Functional
		 * Interface then we can go for method reference. If no such method like
		 * testImplementation() is available then we can go with the Lambda Expressions
		 */
		CustomeFunctionalInterface customeFunctionalInterface = Test::testImplementation;
		customeFunctionalInterface.singleAbsMethod();

		// If no testImplementation is available
		/*
		 * CustomeFunctionalInterface f = () ->
		 * System.out.println("Implementation of SAM"); f.singleAbsMethod();
		 */
	}
}

class Test {
	public static void testImplementation() {
		System.out.println("Test implementation of abstract method");
	}
}