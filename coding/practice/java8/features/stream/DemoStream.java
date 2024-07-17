package coding.practice.java8.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {

	//							Stream
	//				______________|______________
	//				|							|
	// Configuration of Stream			Processing that configuration
	//  ________|______				____________________________|____________________________________
	//		|		|				|		|		|		|			|			|			|
	// Filter		Map			Collect		Count	Sorted	Max Min		ForEach 	toArray		of()
	
		
	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();

		arrList.add(13);
		arrList.add(53);
		arrList.add(25);
		arrList.add(15);
		arrList.add(5);
		arrList.add(63);
		

		findElementWithoutStream(arrList);
		
		findElementWithStream(arrList);
		
		findElementUsingMap(arrList);
	}

	private static void findElementUsingMap(List<Integer> arrList) {
		System.out.println("Using Map");
		arrList.stream().map(i -> i*i).forEach(x -> System.out.println(x) );
		
	}

	private static void findElementWithStream(List<Integer> arrList) {
		System.out.println("With Stream");
		List<Integer> NewArList = arrList.stream().filter(x -> x >= 15).collect(Collectors.toList());
		NewArList.stream().forEach(x -> System.out.println(x));
		//System.out.println("Ordered Consumer");
		//NewArList.stream().forEachOrdered(x -> System.out.println(x));

		System.out.println("With Stream - Single line code");
		arrList.stream().filter(x -> x >= 15).forEach(p -> System.out.println(p));

	}

	private static void findElementWithoutStream(List<Integer> arrList) {

		System.out.println("Without Stream");
		List<Integer> arrListFromMethod = findElements(arrList);
		for (Integer i : arrListFromMethod) {
			System.out.println(i);
		}

	}

	public static List<Integer> findElements(List<Integer> arList) {
		List<Integer> NewArrList = new ArrayList<Integer>();
		for (Integer i : arList) {
			if (i >= 15)
				NewArrList.add(i);
		}
		return NewArrList;
	}

}
