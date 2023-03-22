package seraj;

public class Demo {
	public static void main(String[] args) {
		SBIBank b1 = new SBIBank();
		SBIBank b2 = new SBIBank();
		boolean bankobjstatus = b1.equals(b2);
		System.out.println("Both Banks are equal ??::"+bankobjstatus);
		
		String s1 = new String("Sameer");
		String s2 = new String("Sameer");
		
		boolean stringobjstatus = s1.equals(s2);
		System.out.println("Both String are equal??::"+stringobjstatus);
	}
	}


