package designpattern.creational.singleton;

import designpattern.creational.factory.Teacher;

public class MainClass {

	public static void main(String[] args) {
		SingletonClass singletonObject = SingletonClass.getInstance();
		singletonObject.simpleMethod();
		
		SingletonClass singletonObject2= SingletonClass.getInstance();
		singletonObject2.simpleMethod();
		
		Teacher teacher = new Teacher();
		System.out.println(teacher);
		
		Teacher teacher2 = new Teacher();
		System.out.println(teacher2);
		
	}

}
