package object.java;

public class Student {
	int id;
	String name;
	
	public static void main(String[] args) {
		Student s = new Student();
		s.id=120;
		s.name="Sameer";
		System.out.println(s);
		System.out.println(s.hashcode());
	}
	public String toString() {
		return id+"--"+name;
	}
	public int hashcode() {
		return id;
	}

}
