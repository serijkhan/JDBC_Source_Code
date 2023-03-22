package genericEnums;

public class Outer {
	void outerMethod() {
		Inner i = new Inner();
		i.innerMethod();
	}
	public static void main(String[] args) {
		Outer o = new Outer();
		o.outerMethod();
	}
	class Inner{
		void innerMethod() {
			System.out.println("inner method called...");
		}
	}

}
