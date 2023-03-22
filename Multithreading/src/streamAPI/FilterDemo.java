package streamAPI;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {
	public static void main(String[] args) {
	
		Person1 p1 = new Person1("John","USA");
		Person1 p2 = new Person1("Sameer","Japan");
		Person1 p3 = new Person1("Mantoo","INDIA");
		Person1 p4 = new Person1("Amjad","CHINA");
		
		List<Person1> persons = Arrays.asList(p1,p2,p3,p4);
		
		boolean status1 = persons.stream().anyMatch(p->p.country.equals("INDIA"));
		System.out.println("Any Indian Available ? ::"+status1);
		boolean status2 = persons.stream().anyMatch(p->p.country.equals("CANADA"));
		System.out.println("Any Indian Available ? ::"+status1);
		boolean status3 = persons.stream().anyMatch(p->p.country.equals("INDIA"));
		System.out.println("Any Indian Available ? ::"+status1);
		boolean status4 = persons.stream().anyMatch(p->p.country.equals("MEXICO"));
		System.out.println("No Persons from Mexico ? ::"+status1);
		
		
	}

}
class Person1{
	String name;
	String country;
	
	public Person1(String name,String country) {
		this.name=name;
		this.country=country;
	}
}