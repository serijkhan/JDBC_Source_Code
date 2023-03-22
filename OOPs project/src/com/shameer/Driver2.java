package com.shameer;
class Docter{
	String name;
	int age;
}
public class Driver2 {
	void print(Docter d) {
		System.out.println(d.name + "--" + d.age);
	}
	public static void main(String[] args) {
		Driver2 d = new Driver2();
		
		Docter d1 = new Docter();
		d1.name = "khan";
		d1.age = 18;
		d.print(d1);;
	}
	}


