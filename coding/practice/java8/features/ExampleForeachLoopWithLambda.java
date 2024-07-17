package coding.practice.java8.features;

import java.util.ArrayList;
import java.util.List;

public class ExampleForeachLoopWithLambda {

	public static void main(String[] args) {
		
		List<String> nameslist = new ArrayList<String>();
		nameslist.add("Ankit");
		nameslist.add("Mayank");
		nameslist.add("Irfan");
		nameslist.add("Jai");
		
		
		System.out.println("--- Iterating by passing lambda expression ---");
		nameslist.forEach(names -> System.out.println(names));
		
		System.out.println("--- Iterating by passing lambda expression using ForEachOrdered() ---");
		nameslist.stream().forEachOrdered(names -> System.out.println(names));
		//nameslist.forEach(n -> System.out.println(n));
		
		System.out.println("--- Iterating by passing method reference ---"); 
		nameslist.forEach(System.out::println);
		
		System.out.println("---- Iterating by passing method reference using ForEachOrdered() ---"); 
		nameslist.stream().forEachOrdered(System.out::println);
	}

}
