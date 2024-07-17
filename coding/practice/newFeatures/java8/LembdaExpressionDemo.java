package coding.practice.newFeatures.java8;

import java.util.Comparator;
import java.util.function.BiConsumer;

public class LembdaExpressionDemo {

	public static void main(String[] args) {

		// add(10, 5);

		/*
		 * -------------------------------- java.util.function.BiConsumer ----------
		 * BiConsumer is a Functional Interface (predefined) it comes under function
		 * 
		 * Lambda expression and Functional Interfaces are related
		 * 
		 * Functional Interfaces is used to provide reference to Lambda Expression (->)
		 * is the relation
		 * 
		 */

		BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
		biConsumer.accept(10, 5);

		Comparator<String> c = (s1, s2) -> s1.compareTo(s2);
	}

	// normal method without Lambda Expression
	public static void add(Integer a, Integer b) {
		System.out.println(a + b);
	}

}
