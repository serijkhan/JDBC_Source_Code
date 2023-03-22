package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter4 {
	public static void main(String[] args) {
		Person p1 = new Person("Sameer","USA");
		Person p2 = new Person("Mantoo","Japan");
		Person p3 = new Person("Dallu","India");
		Person p4 = new Person("Shamsul","Uk");
		Person p5 = new Person("Amjad","India");
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		List<Person> indians = persons.stream().filter(p->p.country.equals("INDIA"))
		.collect(Collectors.toList());
		indians.forEach(i->System.out.println(i));
		
	}

}
 class Person{
	 String name;
	 String country;
	 
	 public Person(String name, String country) {
		 this.name= name;
		 this.country= country;
		 
	 }
	 public String toString() {
		 return"Person[name="+name+",country="+country+"]";
		 
	 }
 }