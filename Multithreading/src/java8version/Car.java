package java8version;

interface Vehicale{
	public void start ();
	
	public default void m1() {
		
	}
	public default void m2() {
		
	}
	public static void clean() {
		System.out.println("cleaning completed");
	}
}

public class Car implements Vehicale {
	public void start() {
		System.out.println("car started...");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		Vehicale.clean();
		c.start();
	}

}
