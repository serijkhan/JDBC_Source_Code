package com.shameer;
public class Student {
	void hello() {
		//int a = 10;
		System.out.println("hiiiii");

	}

	static void greet() {
		System.out.println("hi");

	}

	public static void main(String[] args) {
		System.out.println("Hii,i am student");
		Student s1 = new Student(); //Object creation
		//s1 -> Object refrence variable
		s1.hello(); 
		Student.greet(); 
		//System.out.println(s1.a); }
		//Student.hello();

	}
}
