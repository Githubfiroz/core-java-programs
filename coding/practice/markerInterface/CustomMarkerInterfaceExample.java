package coding.practice.markerInterface;

//custom marker interface
interface Car {

}

// custom marker interface
interface Engine {

}

// class that implements the Car marker interface
class Vehicle implements Car{
	static void isVehicle() {
		System.out.println("Car is a Vehicle!!");
	}
}

// class that implements the Engine marker interface
class Status implements Engine {
	static void isWorking() {
		System.out.println("Engine is working!!");
	}
}

// main class
public class CustomMarkerInterfaceExample {

	public static void main(String args[]) {
		// System.out.println("CustomMarkerInterfaceExample - main method called");
		// invoking method of the class
		Vehicle.isVehicle();
		Status.isWorking();

	}
}
