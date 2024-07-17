package designpattern.creational.abstractfactory;

public class Teacher implements Profession{

	@Override
	public void print() {
		System.out.println("I am in method:print, under Teacher.");
		
	}
}
