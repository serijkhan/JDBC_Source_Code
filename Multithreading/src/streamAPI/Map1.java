package streamAPI;

import java.util.stream.Stream;

public class Map1 {
	public static void main(String[] args) {
		Employee e1 = new Employee("Mantoo",35,5500.00);
		Employee e2 = new Employee("Sameer",25,4500.00);
		Employee e3 = new Employee("Sahamsul",45,6600.00);
		Employee e4 = new Employee("Dallu",55,8500.00);
		
		Stream<Employee> stream = Stream.of(e1,e2,e3,e4);
		
//		stream.filter(e->salary>=50000.00)
//		.map(e ->e.name+"-"+e.age).forEach(e->System.out.println(e));
		
		stream.filter(e ->e.salary>=50000.00)
		.forEach(e->System.out.println(e.name+"-"+e.age));
		
	}

}

class Employee{
	String name;
	int age;
	double salary;
	
	public Employee(String name,int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary= salary;
	}
}