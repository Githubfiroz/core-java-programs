package coding.practice.java8.features;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoLambda {

	public static void main(String[] args) {
		System.out.println("Demo Lambda");
//		DemoLambda demo = new DemoLambda();
//		demo.add(5, 10);
		
		//Predefined functional Interface
		//BiConsumer<T, U> 
		//BiPredicate<T, U>
		//Predicate<T>
		//Supplier<T>
		
		//BiConsumer is a 
		 BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println(a+b);
		 biConsumer.accept(15, 10);

	}

//	public void add(Integer a, Integer b) {
//		System.out.println(a+b);
//	}
}
