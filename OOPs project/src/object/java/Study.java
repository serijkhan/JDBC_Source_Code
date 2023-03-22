package object.java;

public class Study {
	int id;
	String name;
	
	public static void main(String[] args) {
		Study s=new Study();
		s.id=102;
		s.name="Mantoo";
		
		System.out.println(s);
		System.out.println(s.toString());
		String s1 = new String("Hii");
		System.out.println(s1);
	}
	public String toString() {
		return id+"--"+name;
	}

}
