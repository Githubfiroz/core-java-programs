package coding.practice.newFeatures.java8;

public interface DefaultMethodInInterface {
	/* void printNameABS(); */

	default void printName() {
		System.out.println("Default method printName() under (I) DefaultMethodInInterface ");
	}

}
