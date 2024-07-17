package designpattern.creational.prototype;

public class PrototypePatternMainClass {

	public static void main(String[] args) {
		
		ProfessionCache.loadProfessionCache();
		
		
		Profession doctorProfession = ProfessionCache.getCloneNewProfession(1);
		
		System.out.println("doctorProfession>>"+doctorProfession);
		
		
		Profession engineerProfession = ProfessionCache.getCloneNewProfession(2);
		
		System.out.println("engineerProfession>>"+engineerProfession);
		
		
		Profession teacherProfession = ProfessionCache.getCloneNewProfession(3);
		
		System.out.println("teacherProfession>>"+teacherProfession);
		
		
		Profession doctorProfession2 = ProfessionCache.getCloneNewProfession(1);
		
		System.out.println("doctorProfession2>>"+doctorProfession2);

	}

}
