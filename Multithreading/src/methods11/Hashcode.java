package methods11;

public class Hashcode {
	int id;
	String name;
	public static void main(String[] args) {
		Hashcode s = new Hashcode();
		s.id =101;
		s.name = "Sameer";
		
		System.out.println(s);
		System.out.println(s.Hashcode());
		
	}
	
	public String toString() {
		return id+"--"+name;
	}
	
	public int Hashcode() {
		return id;
	}

}
