package designpattern.creational.factory;
// Created on 30-Apr-2024
public class FactoryMainClass {

	public static void main(String[] args) {
		ProfessionFactory professionFactory = new ProfessionFactory();
		
		String str = null;
		Profession prof;
		
		prof = professionFactory.getProfession(str);
		
		//prof = professionFactory.getProfession("Doctor");
		
		//prof = professionFactory.getProfession("Engineer");
		
		//prof = professionFactory.getProfession("Teacher");
		
		if(null!=prof)
			prof.print();
		else
			System.out.println("Please Enter a Profession.");

	}

}
