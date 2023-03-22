package com.shameer;
public class Driver5 {
public static void main(String[] args) {
	Driver5 d = new Driver5();
	Person p = d.m1();
	System.out.println(p.id + "--" + p.name + "--" + p.age);
}
    Person m1() {
    	Person p = new Person();
    	p.id = 101;
    	p.name = "rani";
    	p.age = 32;
    	
    	return p;
    }
}
 
class Person{
	int id;
	String name;
	int age;
}
    


