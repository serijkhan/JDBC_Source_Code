package methods11;

public class Boolean {
	int id;
	String name;
	
	public Boolean(int id , String name) {
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		Boolean s1 = new Boolean(101,"johm");
		Boolean s2 = new Boolean(101,"johm");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==
				s2);
		
		String s3 = new String("hii");
		String s4 = new String("hii");
		
		System.out.println(s3.equals(s4));
	}
		
		
	}


