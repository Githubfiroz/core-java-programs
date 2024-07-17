package coding.practice.newFeatures.java8;

@FunctionalInterface
public interface CustomeFunctionalInterface {

	void singleAbsMethod();

	default void printName() {
		System.out.println("Welcome to custome Functional Interface.");
	}

}
