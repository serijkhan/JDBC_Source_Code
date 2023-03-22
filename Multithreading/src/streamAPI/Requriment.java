package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Requriment {
	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1(1,"Sameer",26320.00);
		Employee1 e2 = new Employee1(2,"Mantoo",36320.00);
		Employee1 e3 = new Employee1(3,"Shamsul",16320.00);
		Employee1 e4 = new Employee1(4,"Dallu",66320.00);
		Employee1 e5 = new Employee1(5,"Bhanta",86320.00);
		List<Employee1> list = Arrays.asList(e1,e2,e3,e4,e5);
		
		Optional<Employee1> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
	
		System.out.println("Max Salary::"+max.get().salary);
		
		Optional<Employee1> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));
		System.out.println("Min Salary::"+min.get().salary);
		
		Double avgSalary = list.stream().collect(Collectors.averagingDouble(e->e.salary));
		System.out.println(avgSalary);
	}

}

class Employee1{
	int id;
	String name;
	double salary;
	
	public Employee1(int id,String name, double salary){
		this .id = id;
		this.name=name;
		this.salary=salary;
		
	}
}