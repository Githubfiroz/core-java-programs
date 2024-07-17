package designpattern.creational.abstractfactory;

public class TraineeProfessionAbstractFactory extends AbstractFactory{	
	
	@Override
	public Profession getProfession(String professionType) {
		
		if(null==professionType) {
			return null;
		}
		
		if(professionType.equalsIgnoreCase("Engineer")) {
			return new TraineeEngineer();
			
		}else if(professionType.equalsIgnoreCase("Teacher")) {
			return new TraineeTeacher();
		}		
		
		return null;
	}
}
