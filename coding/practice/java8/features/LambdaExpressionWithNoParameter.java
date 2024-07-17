package coding.practice.java8.features;

interface Sayable{
	//public void say();
	
	public String say();
}


public class LambdaExpressionWithNoParameter {

	
	public static void main(String[] args) {
		
		/*
		//Without Lambda expression
		Sayable s = new Sayable(){
			public void say(){System.out.println("I have nothing to say.");}
			
		}; 
		s.say();
		*/
		
		//Without Lambda expression
		Sayable s = ()->{
			return "I have nothing to say";
		};
		
		System.out.println(s.say());
	}

}
