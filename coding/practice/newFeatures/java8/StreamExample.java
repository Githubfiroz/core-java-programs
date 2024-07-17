package coding.practice.newFeatures.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1,"HP Laptop",25000f));
		productsList.add(new Product(2,"Dell Laptop",30000f));
		productsList.add(new Product(3,"Lenovo Laptop",28000f));
		productsList.add(new Product(4,"Sony Laptop",28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		
		// Start - filtering data without using stream
		List<Float> productPriceList = new ArrayList<Float>();
		
		for(Product product: productsList) {
			if(product.price <30000) {
				productPriceList.add(product.price);
				
			}
		}
		
		System.out.println("productPriceList >>"+productPriceList);
		// End - filtering data without using stream

		// Start - Filtering Collection by using Stream
		List<Float> productPriceList2 = productsList.stream().filter(p -> p.price < 30000).map(p -> p.price)
				.collect(Collectors.toList());
		System.out.println("productPriceList2>>" + productPriceList2);
		// End - Filtering Collection by using Stream

		// Start - Filtering and Iterating Collection
		// This is more compact approach for filtering data
		productsList.stream().filter(p -> p.price == 30000).forEach(p -> System.out.println(p.name));

		// reduce() Method in Collection
		Float totalPrice = productsList.stream().map(p -> p.price).reduce(0.0f, (sum, price) -> sum + price);
		System.out.println("totalPrice>>" + totalPrice);

		// more precise code
		Float totalPrice2 = productsList.stream().map(p -> p.price).reduce(0.0f, Float::sum);
		System.out.println("totalPrice2>>" + totalPrice2);

		// Sum by using Collectors Methods
		double totalPrice3 = productsList.stream().collect(Collectors.summingDouble(p -> p.price));
		System.out.println("totalPrice3>>" + totalPrice3);

		// Find Max and Min Product Price
		Product productMax = productsList.stream().max((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println("productMax price>>" + productMax.price);

		Product productMin = productsList.stream().max((product1, product2) -> product1.price < product2.price ? 1 : -1)
				.get();
		System.out.println("productMin price>>" + productMin.price);

		// count() Method in Collection
		long count = productsList.stream().filter(p -> p.price <= 30000).count();
		System.out.println("count>>" + count);

		// can get you result as set, list or map and can perform manipulation on the
		// elements.
		// Convert List into Set
		Set<Float> productPriceSet = productsList.stream().filter(p -> p.price < 30000).map(p -> p.price)
				.collect(Collectors.toSet());
		System.out.println("productPriceSet >>" + productPriceSet);

		// Convert List into Map
		Map<Integer, String> productMap = productsList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println("productMap >>" + productMap);

		// Method Reference in stream
		List<Float> prodPriceList = productsList.stream().filter(p -> p.price < 30000).map(Product::getPrice)
				.collect(Collectors.toList());
		System.out.println("prodPriceList>>" + prodPriceList);

		// End - Filtering and Iterating Collection

	}

}
