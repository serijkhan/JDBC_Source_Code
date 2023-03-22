package streamAPI;

import java.util.stream.Stream;

public class Filter1 {
	
	public static void main(String[] args) {
		
		User u1 = new User("Sameer",18);
		User u2 = new User("Anupama",25);
		User u3 = new User("Ashok",36);
		User u4 = new User("Raju",58);
		User u5 = new User("mantoo",65);
		User u6 = new User("Shamsul",18);
		
		Stream<User> stream = Stream.of(u1,u2,u3,u4,u5,u6);
		
		stream.filter(u -> u.age>=18)
		.filter(u -> u.name.startsWith("A"))
		.forEach(u -> System.out.println(u));
		
	}

}
 class User{
	 String name;
	 int age;
	 
	 User(String name, int age){
		 this.name = name;
		 this.age = age;
	 }
	 public String toString() {
		 return "User[name ="+name+",age="+age+"]";
		 
	 }
 }