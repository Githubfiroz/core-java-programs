package designpattern.creational.abstractfactory;

public class Engineer implements Profession{
	@Override
	public void print() {
		System.out.println("I am in method:print, under Engineer.");
		
	}

}
