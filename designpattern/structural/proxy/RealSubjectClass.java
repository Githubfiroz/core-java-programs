package designpattern.structural.proxy;

public class RealSubjectClass implements Subject{

	@Override
	public void method() {
		System.out.println("I am an actual implementation of Subject, rest all are proxies :D");
		
	}
}
