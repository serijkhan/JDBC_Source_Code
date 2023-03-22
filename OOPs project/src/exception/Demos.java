package exception;

public class Demos {
	void m1() {
		m2();
	}
	void m2() {
		m1();
	}
	public static void main(String[] args) {
		System.out.println("main()method.start");
		Demos d = new Demos();
		d.m1();
		System.out.println("main()method-end");
	}
	}


