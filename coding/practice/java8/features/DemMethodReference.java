package coding.practice.java8.features;

import java.util.function.BiConsumer;

public class DemMethodReference {
	static void ShowDetails(String name, Integer age) {
		System.out.println("Name : " + name + ", Age " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<String, Integer> biCon = DemMethodReference::ShowDetails;
		biCon.accept("Aaban", 13);
	}

}
