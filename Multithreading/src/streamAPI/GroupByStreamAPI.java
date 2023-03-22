package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupByStreamAPI {
	public static void main(String[] args) {
		
		Employees e1 = new Employees(1,"Mantoo",26530.00,"USA");
		Employees e2 = new Employees(2,"Mantoo",16530.00,"INDIA");
		Employees e3 = new Employees(3,"Mantoo",66530.00,"CHINA");
		Employees e4 = new Employees(4,"Mantoo",36530.00,"INDIA");
		Employees e5 = new Employees(5,"Mantoo",25530.00,"USA");
		
		List<Employees> list = Arrays.asList(e1,e2,e3,e4,e5);
		//Map<String, List<Employees>> data = list.stream()
				//.collect(Collectors.groupingBy(e->e.country));
		
		//System.out.println(data);
		
	}

}
class Employees{
	int id;
	String name;
	double salary;
	String country;
	
	
	public Employees(int id,String name,double salary,String country) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.country=country;
}
}