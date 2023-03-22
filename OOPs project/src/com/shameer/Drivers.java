package com.shameer;
class Employee{
	int id;
	double salary;
}
public class Drivers {
public static void main(String[] args) {
	Drivers d= new Drivers();
	
	Employee e= new Employee();
	e.id = 101;
	e.salary = 15000.00;
	
	d.print(e);
}
void print(Employee e) {
	System.out.println(e.id + "--" + e.salary );
}
}
