package inheritance;

public class Employee extends User {
	void m2() {
		System.out.println("child class -m2() method called");
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.m1();
		emp.m2();
	}
	}


