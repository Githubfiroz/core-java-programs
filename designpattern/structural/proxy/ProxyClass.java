package designpattern.structural.proxy;

public class ProxyClass extends RealSubjectClass{

	@Override
	public void method() {
		System.out.println("Hi, I am Proxy, I will perform authentication and security checks");

		//Logic to check if user is authentic or not. If yes then call real object
		//method else don't call below method
		
		System.out.println("Calling real method of Real subject implementing class after the call is authentic");
		
		super.method();
	}
}
