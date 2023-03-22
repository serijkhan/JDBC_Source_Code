package com.shameer;
class Parent{
	void m1() {
		System.out.println("Parent-class-m1 called");
	}
	void m2() {
		System.out.println("Parent-class-m2 called");
	}
}
class Child extends Parent{
	public int hashcode() {
		return 159;
	}
	void m1() {
		System.out.println("Child-class-m1 called");
	}
	void m2() {
		System.out.println("Child-class-m2 called");
		super.m2();
	}
}
public class Test {
	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
		int hashcode = c.hashcode();
		System.out.println("hashcode::"+hashcode);
	}

}
