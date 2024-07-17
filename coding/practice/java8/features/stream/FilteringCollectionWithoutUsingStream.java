package coding.practice.java8.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {

		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	
}

public class FilteringCollectionWithoutUsingStream {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();

		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		List<Float> productPriceList = new ArrayList<Float>();

		// filtering data of list
		for (Product product : productsList) {
			if (product.price < 30000)
				productPriceList.add(product.price); // adding price to a productPriceList

		}
		//System.out.println("< 30000 productPriceList ->" + productPriceList);

		List<Float> productPriceList2 = productsList.stream().filter(p -> p.price > 30000).map(p -> p.price)
				.collect(Collectors.toList());
		
		//Method Reference in stream
		List<Float> productPriceList3 = productsList.stream().filter(p -> p.price > 30000).map(Product::getPrice).collect(Collectors.toList());
		
		System.out.println("> 30000 productPriceList2->"+productPriceList2);
		System.out.println("> 30000 productPriceList3->"+productPriceList3);
		
		//Find Max and Min Product Price -  
		// max() method to get max Product price
		Product productA = productsList.stream().max((product1, product2) -> product1.price > product2.price ? 1:-1).get();
		//System.out.println(productA.price);
		
		 // min() method to get min Product price
		Product productB = productsList.stream().min((product1, product2) -> product1.price > product2.price? 1:-1).get();
		//System.out.println(productB.price);
		
		// count number of products based on the filter  
		
		long count = productsList.stream().filter( p -> p.price<30000 ).count();
		System.out.println("count>>"+count);
		
		//Convert List into Set
		Set<Float> productPriceList5 = productsList.stream().filter(p->p.price<30000).map(p->p.price).collect(Collectors.toSet());
		System.out.println("productPriceList3>>"+productPriceList5);
		
		 // Converting Product List into a Map  
		Map<Integer, String> productPriceMap = productsList.stream().collect(Collectors.toMap(p->p.id, p->p.name));
		System.out.println("productPriceMap>>"+productPriceMap);
	}

}
