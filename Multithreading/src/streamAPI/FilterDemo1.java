package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
	public static void main(String[] args) {
		
		Person2 p1 = new Person2("Sameer","USA");
		Person2 p2 = new Person2("Mantoo","JAPAN");
		Person2 p3 = new Person2("Dallu","INDIA");
		Person2 p4 = new Person2("Shamsul","CHINA");
		Person2 p5 = new Person2("Ashish","INDIA");
		
		List<Person2> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
		List<Person2> indians = persons.stream().filter(p->p.country.equals("INDIA"))
				.collect(Collectors.toList());
		indians.forEach(i->System.out.println(i));
	}

}

class Person2{
	String name;
	String country;
	
	public Person2 (String name, String country) {
	
		this.name=name;
		this.country=country;
	}
	
	public String toString() {
		return "Person2[name="+name+",country="+country+"]";
		
	}
}