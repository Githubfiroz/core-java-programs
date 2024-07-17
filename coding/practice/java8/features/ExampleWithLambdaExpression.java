package coding.practice.java8.features;

@FunctionalInterface
interface Drawable{
	public void draw();
}

public class ExampleWithLambdaExpression {

	public static void main(String[] args) {
		int width=20;
		
		Drawable d2 = () -> {System.out.println("Draw width "+width);};
		
		d2.draw();
	}
}
