package functionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
}

public class PredicatePersonDemo {
	public static void main(String[] args) {
		Person p1 = new Person("John",26);
		Person p2 = new Person("Sameer",16);
		Person p3 = new Person("Mantoo",20);
		Person p4 = new Person("Shamsul",23);
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4);
		
		Predicate<Person> predicate = p -> p.age >= 18;
		
		for(Person person: persons) {
			if(predicate.test(person)) {
				System.out.println(person.name);
			}
		}
	}

}
