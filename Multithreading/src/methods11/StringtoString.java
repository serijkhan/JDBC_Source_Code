package methods11;

public class StringtoString {
	int id;
	String name;
	public static void main(String[] args) {
		StringtoString s = new StringtoString();
		s.id =101;
		s.name ="Sameer";
		
		System.out.println(s);
		System.out.println(s.toString());
		
		String s1 = new String("hii");
		System.out.println(s1);
		
	}
	
	public String toString() {
		return id+"---"+name;
	}

}
