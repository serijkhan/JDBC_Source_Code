package streamAPI;

import java.util.stream.Stream;

public class Filter5 {
	public static void main(String[] args) {
		
		Users u1 = new Users("Mantoo",19);
		Users u2 = new Users("Sameer",25);
		Users u3 = new Users("Anupama",36);
		Users u4 = new Users("Apshara",45);
		Users u5 = new Users("Ashok",356);
		Users u6 = new Users("Amjad",18);
		
		Stream<Users> stream = Stream.of(u1,u2,u3,u4,u5,u6);
		
		stream.filter(u->u.age>=18)
		.filter(u->u.name.startsWith("A"))
		.forEach(u->System.out.println(u));
		
	}

}
class Users{
	String name;
	int age;
	
	Users(String name,int age){
		this.name = name;
		this.age= age;
	}
	
	public String toString() {
		return "Users[name="+ name +",age="+age+"]";
		
	}
}