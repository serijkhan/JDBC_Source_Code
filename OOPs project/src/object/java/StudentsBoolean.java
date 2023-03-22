package object.java;

public class StudentsBoolean {
	int id;
	String name;
	
	public StudentsBoolean(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		StudentsBoolean s1=new StudentsBoolean(102,"john");
		StudentsBoolean s2=new StudentsBoolean(102,"john");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String s3 = new String("Hi");
		String s4 = new String("Hi");
		 System.out.println(s3.equals(s4));
	}
	}


