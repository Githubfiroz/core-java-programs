package coding.practice.java8.features;

import java.util.HashMap;
//import java.util.Map;

public class HashMapCollisionExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hasMap= new HashMap<>();
		
		hasMap.put("one", 1);
		
		hasMap.put("two", 2);
		
		Integer value = hasMap.get("one");
		
		System.out.println(value);
		

	}

}
