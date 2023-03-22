package hierarchical;

class Parent{
	void m1() {
		System.out.println("Parent-class-m1() called");
	}
	void m2() {
		System.out.println("Parent-class-m2()-called");
	}
}

public class Child  extends Parent{
	public int hashcode() {
		return 101;
	}
	void m1() {
		System.out.println("Child class-m1() called");
	}
	void m2() {
		System.out.println("child-class-m2()called");
		super.m2();
	}

}
