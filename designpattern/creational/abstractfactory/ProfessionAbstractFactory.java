package designpattern.creational.abstractfactory;

public class ProfessionAbstractFactory extends AbstractFactory{	
	
	@Override
	public Profession getProfession(String professionType) {
		
		if(null==professionType) return null;
		
		if(professionType.equalsIgnoreCase("Engineer")) {
			return new Engineer(); 
		}else if(professionType.equalsIgnoreCase("Teacher")) {
			return new Teacher();
		}
		
		return null;
		
	}
}
