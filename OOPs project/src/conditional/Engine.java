package conditional;

public class Engine {
	int id;
	String name;
	String fuelType;
	
	void start() {
		System.out.println("Engine Starting ...");
	}
}

class Car{
	private Car drive;
	void drive() {
		Engine e = new Engine();
		e.start();
		System.out.println("Jouraney Started");
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.drive = new Car();
		c.drive();
		
	}

}
