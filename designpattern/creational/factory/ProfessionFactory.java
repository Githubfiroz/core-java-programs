package designpattern.creational.factory;

public class ProfessionFactory {

	public Profession getProfession(String professionType) {
		if(null==professionType) {
			return null;
		}
		
		if(professionType.equalsIgnoreCase("Doctor")) {
			return new Doctor();
			
		}else if(professionType.equalsIgnoreCase("Engineer")) {
			return new Engineer();
			
		}else if(professionType.equalsIgnoreCase("Teacher")) {
			return new Teacher();
			
		}
		
		return null;
	}

}
