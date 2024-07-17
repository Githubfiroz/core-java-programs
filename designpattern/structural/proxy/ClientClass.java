package designpattern.structural.proxy;

public class ClientClass {
	
	public static void main(String[] args) {
		
		Subject proxy = new ProxyClass();
		
		proxy.method();
		
	}

}
