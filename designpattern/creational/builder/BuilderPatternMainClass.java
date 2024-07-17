package designpattern.creational.builder;

public class BuilderPatternMainClass {

	public static void main(String[] args) {
		
		//Create object of required homeBuilder
		EarthQuakeResistantBuilder earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();
		
		//create object of Director that will keep an eye on your builder
		Director director = new Director(earthQuakeResistantBuilder);
		
		director.manageRequiredHomeConstruction();
		
		Home homeConstructedAtTheEnd = director.getComplexObjectOfHome();
		
		System.out.println(homeConstructedAtTheEnd);
		
		System.out.println(homeConstructedAtTheEnd.floor);

	}

}
