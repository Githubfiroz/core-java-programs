package designpattern.creational.abstractfactory;
//30-Apr-24
public class AbstractFactoryPatternMainClass {

	public static void main(String[] args) {
		
		//isTrainee==true
		//First get factory instance from factory of factory class, if you want trainee
		AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
		
		Profession prof = abstractFactory.getProfession("Engineer");
		
		prof.print();
		
	}

}
