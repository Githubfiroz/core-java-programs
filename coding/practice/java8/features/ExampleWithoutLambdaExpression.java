package coding.practice.java8.features;

interface Drawable1{
	public void draw();
}

 

public class ExampleWithoutLambdaExpression {
	public static void main(String[] args) {
		int width=10;
		
		Drawable d = new Drawable(){
			public void draw(){System.out.println("Drawing ="+width);}
		};
		
		d.draw();
	}
	
}
